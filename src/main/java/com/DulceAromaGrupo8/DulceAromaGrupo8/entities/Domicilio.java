package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

public class Domicilio {
    private String calle;
    private Integer numero;
    private Integer cp;
    public Domicilio(String calle,Integer numero,Integer cp){
        this.calle=calle;
        this.numero=numero;
        this.cp=cp;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCp() {
        return cp;
    }
}
