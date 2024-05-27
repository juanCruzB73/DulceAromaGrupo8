package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.enums.Estado;
import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.enums.Rol;

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    //private Rol rol;
    public Cliente(String nombre, String apellido, String telefono,String email){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}