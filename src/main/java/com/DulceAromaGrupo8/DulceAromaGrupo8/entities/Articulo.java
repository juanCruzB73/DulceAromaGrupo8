package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Articulos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder


public class Articulo extends Base {

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)

    @JoinColumn(name = "articulos_id")

    @Builder.Default
    @Audited

    protected List<ImagenArticulo> imagenArticulos = new ArrayList<>();

    @ManyToOne
    private UnidadMedida unidadMedida;

    protected String denominacion;
    protected double precioVenta;
}
