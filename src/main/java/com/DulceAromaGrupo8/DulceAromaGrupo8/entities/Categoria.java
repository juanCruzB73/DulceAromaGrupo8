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
@Table(name = "categorias")
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Audited


public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String denominacion;

    @OneToMany
    @JoinColumn(name = "categoria_id")
    @Builder.Default
    private Set<Categoria>categorias = new HashSet<>();

}
