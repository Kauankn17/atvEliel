package com.example.padaria.services;

import com.example.padaria.models.PadariaModel;
import com.example.padaria.repository.PadariaRepository;
import com.example.padaria.models.PadariaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadariaService {

    @Autowired
    private PadariaRepository padariaRepository;

    public List<com.example.padaria.models.PadariaModel> findAll() {
        return padariaRepository.findAll();
    }

    public PadariaModel buscarPorId(long id) {
        return padariaRepository.findById(id).get();
    }

    public PadariaModel criarPadaria(PadariaModel PadariaModel) {
        return padariaRepository.save(PadariaModel);
    }

    public void deletarPadaria(long id) {
        padariaRepository.deleteById(id);
    }

    public PadariaModel atualizarPadaria(Long id, PadariaModel PadariaModel) {
        PadariaModel Padaria = padariaRepository.findById(id).get();

        Padaria.setNome(PadariaModel.getNome());
        Padaria.setEndereco(PadariaModel.getEndereco());


        return padariaRepository.save(Padaria);
    }
}
