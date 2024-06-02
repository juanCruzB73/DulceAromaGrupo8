package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalles")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class ArticuloManufacturadoDetalle extends Base {

    @ManyToOne
    private ArticuloInsumo articuloInsumo;

    @Column(name = "cantidad")
    private int cantidad;
}
