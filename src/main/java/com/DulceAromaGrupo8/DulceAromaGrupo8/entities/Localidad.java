package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Localidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    private Provincia provincia;


}
