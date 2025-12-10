package br.ifs.edu.cads.api.hotel.dto;
import br.ifs.edu.cads.api.hotel.model.Estado;

public record EstadoDTO(Long id, String uf) {
    public EstadoDTO(Estado estado) {
        this(estado.getId(), estado.getUf());
    }
}