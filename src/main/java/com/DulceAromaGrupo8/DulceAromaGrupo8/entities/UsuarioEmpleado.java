package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Usuario_Empleado")
@Data
@NoArgsConstructor
@Setter
@Getter
public class UsuarioEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String auth0rId;
    private String username;
    public UsuarioEmpleado(String auth0rId,String username){
        this.auth0rId=auth0rId;
        this.username=auth0rId;
    }

    public String getAuth0rId() {
        return auth0rId;
    }

    public String getUsername() {
        return username;
    }
}
