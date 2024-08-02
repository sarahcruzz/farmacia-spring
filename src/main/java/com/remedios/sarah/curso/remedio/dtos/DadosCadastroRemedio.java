package com.remedios.sarah.curso.remedio.dtos;

import com.remedios.sarah.curso.remedio.enums.Laboratorio;
import com.remedios.sarah.curso.remedio.enums.Via;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroRemedio(

        @NotBlank
        String nome,

        @Enumerated
        Via via,

        @NotBlank
        String lote,

        int quantidade,

        @Future
        LocalDate validade,

        @Enumerated
        Laboratorio laboratorio) {
}
