package com.remedios.sarah.curso.controllers;

import com.remedios.sarah.curso.remedio.dtos.DadosAtualizarRemedio;
import com.remedios.sarah.curso.remedio.dtos.DadosCadastroRemedio;
import com.remedios.sarah.curso.remedio.dtos.DadosListagemRemedio;
import com.remedios.sarah.curso.remedio.entity.Remedio;
import com.remedios.sarah.curso.remedio.repository.RemedioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @Autowired
    private RemedioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroRemedio dados){
        repository.save(new Remedio(dados));
    }

    @GetMapping
    public List<DadosListagemRemedio> listar(){
        return repository.findAll().stream().map(DadosListagemRemedio::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarRemedio dados){
        var remedio = repository.getReferenceById(dados.id());
        remedio.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @DeleteMapping("/inativar/{id}")
    @Transactional
    public void inativar(@PathVariable Long id){
        var remedio = repository.getReferenceById(id);
        remedio.inativar();
    }

    @PutMapping("/ativar/{id}")
    @Transactional
    public void ativar(@PathVariable Long id){
        var remedio = repository.getReferenceById(id);
        remedio.ativar();
    }



}
