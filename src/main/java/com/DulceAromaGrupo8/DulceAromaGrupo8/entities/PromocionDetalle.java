package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Promocion_Detalle")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PromocionDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;

    @ManyToOne
    private Promocion promocion;
}
