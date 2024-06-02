package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "detalles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class DetallePedido extends Base {

    @ManyToOne
    Articulo articulo;



    private Integer cantidad;
    private Double subTotal;


}
