package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    /*
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "articulos_manufacturados_id")
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> articulosManufacturadosDetalle = new HashSet<>();
    */
}
