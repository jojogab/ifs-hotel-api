package br.ifs.edu.cads.api.hotel.service;

import br.ifs.edu.cads.api.hotel.dto.EstadoDTO;
import br.ifs.edu.cads.api.hotel.model.Estado;
import br.ifs.edu.cads.api.hotel.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repository;

    public List<EstadoDTO> listarTodos() {
        return repository.findAll().stream().map(EstadoDTO::new).toList();
    }

    public EstadoDTO salvar(EstadoDTO dto) {
        Estado estado = new Estado();
        estado.setUf(dto.uf());
        return new EstadoDTO(repository.save(estado));
    }
}