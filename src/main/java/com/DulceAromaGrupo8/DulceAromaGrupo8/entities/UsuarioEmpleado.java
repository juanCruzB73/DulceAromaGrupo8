package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

public class UsuarioEmpleado {
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
