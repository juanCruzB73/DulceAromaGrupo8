package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Domicilio")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;
    private Integer numero;

    @Column(name = "codigo_postal")
    private Integer cp;

    @ManyToMany
    private Set<Cliente> clientes = new HashSet<>();

    @ManyToOne
    private Localidad localidad;
}
