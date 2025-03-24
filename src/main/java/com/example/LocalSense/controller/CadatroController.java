package com.example.LocalSense.controller;

import com.example.LocalSense.model.Cadastro;
import com.example.LocalSense.repository.CadastroRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class CadatroController {

    CadastroRepository cadastroRepository;

    public CadatroController(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    @PostMapping
    public Cadastro salvar(@RequestBody Cadastro cadastro) {
        System.out.println("Cadastro realizado" + cadastro);

        cadastroRepository.save(cadastro);
        return cadastro;
    }

    @GetMapping("/{cpf}")
    public Cadastro buscarCpf(@PathVariable("cpf") String cpf) {
        return cadastroRepository.findByCpf(cpf).orElse(null);
    }

}
