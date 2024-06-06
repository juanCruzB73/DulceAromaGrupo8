package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "imagen_articulo")

public class ImagenArticulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "denominacion")
    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "articulos_id")
    private Articulo articulo;
}
