package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Provincia")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    private Pais pais;

}
