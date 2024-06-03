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

public class ArticuloInsumo extends Articulo{

    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;






    /*
    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Categoria categoria;
     */


}
