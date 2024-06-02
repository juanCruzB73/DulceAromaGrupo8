package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "detalles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class ArticuloManufacturadoDetalle extends Base {

    @ManyToOne
    private ArticuloInsumo articuloInsumo;

    @Column(name = "cantidad")
    private int cantidad;
}
