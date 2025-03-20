package com.example.LocalSense.controller;

import com.example.LocalSense.model.Cadastro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class CadatroController {

    @PostMapping
    public Cadastro salvar(@RequestBody Cadastro cadastro){
        System.out.println(cadastro);
        return cadastro;
    }

}
