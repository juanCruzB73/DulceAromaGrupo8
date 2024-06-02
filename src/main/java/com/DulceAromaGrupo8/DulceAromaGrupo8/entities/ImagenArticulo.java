package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "imagen")

public class ImagenArticulo extends Base{
    private String denominacion;
}
