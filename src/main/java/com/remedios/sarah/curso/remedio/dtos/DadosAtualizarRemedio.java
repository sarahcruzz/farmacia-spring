package com.remedios.sarah.curso.remedio.dtos;

import com.remedios.sarah.curso.remedio.enums.Laboratorio;
import com.remedios.sarah.curso.remedio.enums.Via;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarRemedio(
        @NotNull
        Long id,
        String nome,
        Via via,
        Laboratorio laboratorio) {
}
