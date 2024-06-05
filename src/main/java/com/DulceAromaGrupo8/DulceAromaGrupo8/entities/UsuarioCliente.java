package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Usuario_Cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor

@Setter
@Getter
public class UsuarioCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String auth0rId;
    private String username;

    public UsuarioCliente(String auth0rId,String username) {
        this.auth0rId = auth0rId;
        this.username = username;
    }

}
