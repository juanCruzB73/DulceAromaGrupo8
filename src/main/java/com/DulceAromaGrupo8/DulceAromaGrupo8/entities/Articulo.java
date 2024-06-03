package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)

    @JoinColumn(name = "articulos_id")

    @Builder.Default

    protected List<ImagenArticulo> imagenArticulos = new ArrayList<>();

    @ManyToOne
    protected UnidadMedida unidadMedida;
}


