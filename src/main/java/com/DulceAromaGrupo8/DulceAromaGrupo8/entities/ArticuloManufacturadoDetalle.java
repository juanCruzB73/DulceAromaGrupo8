package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class ArticuloManufacturadoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer cantidad;

    @ManyToOne
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    private ArticuloManufacturado articuloManufacturado;


}
