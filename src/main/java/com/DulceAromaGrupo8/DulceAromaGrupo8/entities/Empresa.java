package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Empresa")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "Razon_Social")
    private String razonSocial;
    private Integer cuil;

    @OneToMany(mappedBy = "empresa")
    private List<Sucursal> sucursales;
}
