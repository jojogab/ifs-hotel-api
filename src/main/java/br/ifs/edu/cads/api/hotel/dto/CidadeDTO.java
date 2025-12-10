package br.ifs.edu.cads.api.hotel.dto;
import br.ifs.edu.cads.api.hotel.model.Cidade;

public record CidadeDTO(Long id, String nome, Long estadoId) {
    public CidadeDTO(Cidade cidade) {
        this(cidade.getId(), cidade.getNome(), cidade.getEstado().getId());
    }
}