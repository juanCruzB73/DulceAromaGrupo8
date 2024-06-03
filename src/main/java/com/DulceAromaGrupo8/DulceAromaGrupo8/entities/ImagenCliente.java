package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "imagen_cliente")
public class ImagenCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "denominacion")
    private String denominacion;
    public ImagenCliente(String denominacion){
        this.denominacion=denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }
}
