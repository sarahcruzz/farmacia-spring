package com.remedios.sarah.curso.remedio.dtos;

import com.remedios.sarah.curso.remedio.enums.Laboratorio;
import com.remedios.sarah.curso.remedio.enums.Via;

public record DadosCadastroRemedio(String nome,
                                   Via via,
                                   String lote,
                                   String quantidade,
                                   String validade,
                                   Laboratorio laboratorio) {
}
