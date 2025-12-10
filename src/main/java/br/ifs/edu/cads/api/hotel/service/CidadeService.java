package br.ifs.edu.cads.api.hotel.service;

import br.ifs.edu.cads.api.hotel.dto.CidadeDTO;
import br.ifs.edu.cads.api.hotel.model.Cidade;
import br.ifs.edu.cads.api.hotel.model.Estado;
import br.ifs.edu.cads.api.hotel.repository.CidadeRepository;
import br.ifs.edu.cads.api.hotel.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    public List<CidadeDTO> listarTodas() {
        return cidadeRepository.findAll().stream().map(CidadeDTO::new).toList();
    }

    public CidadeDTO salvar(CidadeDTO dto) {
        Estado estado = estadoRepository.findById(dto.estadoId())
                .orElseThrow(() -> new RuntimeException("Estado não encontrado"));

        Cidade cidade = new Cidade();
        cidade.setNome(dto.nome());
        cidade.setEstado(estado);

        return new CidadeDTO(cidadeRepository.save(cidade));
    }
}