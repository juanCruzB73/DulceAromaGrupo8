package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Domicilio")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private String calle;
    @Getter
    private Integer numero;
    @Getter

    @Column(name = "codigo_postal")
    private Integer cp;

    @ManyToOne
    private Localidad localidad;

}
