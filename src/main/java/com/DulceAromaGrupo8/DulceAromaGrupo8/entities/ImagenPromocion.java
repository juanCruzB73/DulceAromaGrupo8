package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Imagen_Promocion")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ImagenPromocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;

    @ManyToOne
    private Promocion promocion;
}
