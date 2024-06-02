package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "Medidas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class UnidadMedida extends Base{
    private String denominacion;


}
