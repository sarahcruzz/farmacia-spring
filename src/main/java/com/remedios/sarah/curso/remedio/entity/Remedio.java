package com.remedios.sarah.curso.remedio.entity;

import com.remedios.sarah.curso.remedio.enums.Laboratorio;
import com.remedios.sarah.curso.remedio.enums.Via;
import jakarta.persistence.*;
import lombok.*;

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


}
