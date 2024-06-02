package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Medidas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UnidadMedida extends Base{
    private String denominacion;


}
