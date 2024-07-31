package com.remedios.sarah.curso.remedio.entity;

import com.remedios.sarah.curso.remedio.dtos.DadosCadastroRemedio;
import com.remedios.sarah.curso.remedio.enums.Laboratorio;
import com.remedios.sarah.curso.remedio.enums.Via;
import jakarta.persistence.*;
import lombok.*;

import java.util.Scanner;

@Table(name = "Remedio")
@Entity(name = "remedios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedio {

    // atributos da entidade
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Via via;
    private String lote;
    private String quantidade;
    private String validade;

    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;


    public Remedio(DadosCadastroRemedio dados) {
        this.nome = dados.nome();
        this.via = dados.via();
        this.lote = dados.lote();
        this.quantidade = dados.quantidade();
        this.validade = dados.validade();
        this.laboratorio = dados.laboratorio();
    }

}
