package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Usuario_Empleado")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UsuarioEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String auth0rId;
    private String username;

    public UsuarioEmpleado(String auth0rId, String username) {
        this.auth0rId = auth0rId;
        this.username = username;
    }


}
