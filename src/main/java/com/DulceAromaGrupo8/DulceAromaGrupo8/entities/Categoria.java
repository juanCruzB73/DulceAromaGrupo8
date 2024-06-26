package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String denominacion;
    private boolean esInsumo;


    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "categorias_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursales_id")
    )
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

}
