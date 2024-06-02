package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ArticulosInsumo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class ArticuloInsumo extends Articulo{


    @Column(name = "Articulo_Insumos")

    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;

}
