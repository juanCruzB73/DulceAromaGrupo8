package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

@Entity
@Table(name = "imagen")

public class ImagenArticulo {
    private String denominacion;
}
