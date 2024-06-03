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

    private String calle;
    private Integer numero;

    @Column(name = "codigo_postal")
    private Integer cp;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // Esto es opcional pero recomendable para definir la columna en la tabla.
    private Cliente cliente;

    @ManyToOne
    private Localidad localidad;
}
