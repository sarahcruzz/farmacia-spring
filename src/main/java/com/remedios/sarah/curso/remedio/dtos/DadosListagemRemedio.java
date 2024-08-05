package com.remedios.sarah.curso.remedio.dtos;

import com.remedios.sarah.curso.remedio.entity.Remedio;
import com.remedios.sarah.curso.remedio.enums.Laboratorio;
import com.remedios.sarah.curso.remedio.enums.Via;

import java.time.LocalDate;

public record DadosListagemRemedio(
        String nome,
        Via via,
        String lote,
        Laboratorio laboratorio,
        LocalDate validade) {

    public DadosListagemRemedio(Remedio remedio) {
        this(remedio.getNome(), remedio.getVia(), remedio.getLote(), remedio.getLaboratorio(), remedio.getValidade());
    }
}
