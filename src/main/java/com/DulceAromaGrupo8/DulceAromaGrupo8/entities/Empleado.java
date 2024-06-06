package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "Empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email")
    private String email;
    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;

    @ManyToOne
    private Sucursal sucursal;
    @OneToOne
    private ImagenEmpleado imgenEmpleado;
    @OneToOne
    private UsuarioEmpleado usuarioEmpleado;

}