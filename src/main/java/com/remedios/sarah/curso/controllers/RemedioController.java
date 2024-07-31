package com.remedios.sarah.curso.controllers;

import com.remedios.sarah.curso.remedio.dtos.DadosCadastroRemedio;
import com.remedios.sarah.curso.remedio.entity.Remedio;
import com.remedios.sarah.curso.remedio.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @Autowired
    private RemedioRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemedio dados){
        repository.save(new Remedio(dados));
    }



}
