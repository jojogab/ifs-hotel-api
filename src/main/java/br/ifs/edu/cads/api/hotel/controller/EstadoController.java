package br.ifs.edu.cads.api.hotel.controller;

import br.ifs.edu.cads.api.hotel.dto.EstadoDTO;
import br.ifs.edu.cads.api.hotel.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService service;

    @GetMapping
    public List<EstadoDTO> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public EstadoDTO criar(@RequestBody EstadoDTO dto) {
        return service.salvar(dto);
    }
}