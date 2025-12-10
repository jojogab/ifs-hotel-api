package br.ifs.edu.cads.api.hotel.controller;

import br.ifs.edu.cads.api.hotel.dto.CidadeDTO;
import br.ifs.edu.cads.api.hotel.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService service;

    @GetMapping
    public List<CidadeDTO> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public CidadeDTO criar(@RequestBody CidadeDTO dto) {
        return service.salvar(dto);
    }
}