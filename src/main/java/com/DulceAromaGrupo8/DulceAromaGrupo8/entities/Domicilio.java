package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Domicilio")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;
    private Integer numero;

    @Column(name = "codigo_postal")
    private Integer cp;

    @ManyToMany(mappedBy = "domicilio")
    @JoinColumn(name = "cliente_id")// Esto es opcional pero recomendable para definir la columna en la tabla.
    private Set<Cliente> clientes = new HashSet<>();

    @ManyToOne
    private Localidad localidad;
}
