package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)

public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected String denominacion;
    protected double precioVenta;

    @OneToMany(mappedBy = "articulo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ImagenArticulo> imagenes = new HashSet<>();

    @ManyToOne
    protected UnidadMedida unidadMedida;
}


