package com.example.padaria.controllers;

import com.example.padaria.models.PadariaModel;
import com.example.padaria.services.PadariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Padaria")
public class PadariaController {

    @Autowired
    private PadariaService padariaService;

    @GetMapping
    public List<PadariaModel> findAll() {
        return padariaService.findAll();
    }

    @GetMapping("/{id}")
    public PadariaModel buscarPorId(@PathVariable Long id) {
        return padariaService.buscarPorId(id);
    }

    @PostMapping
    public PadariaModel adicionarPadaria(@RequestBody PadariaModel padaria) {
        return padariaService.criarPadaria(padaria);
    }

    @PutMapping("/{id}")
    public PadariaModel atualizarPadaria(
            @PathVariable Long id,
            @RequestBody PadariaModel padariaModel) {

        return padariaService.atualizarPadaria(id, padariaModel);
    }

    @DeleteMapping("/{id}")
    public void deletarPadaria(@PathVariable Long id) {
        padariaService.deletarPadaria(id);
    }
}
