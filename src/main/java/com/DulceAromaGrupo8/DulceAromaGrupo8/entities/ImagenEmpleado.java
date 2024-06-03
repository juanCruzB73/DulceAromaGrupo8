package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Imagen_Empleado")
@Data
@NoArgsConstructor
@Setter
@Getter
public class ImagenEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    public ImagenEmpleado(String denominacion){
        this.denominacion=denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }
}
