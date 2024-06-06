package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Cliente {

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

    @OneToOne
    private UsuarioCliente usuarioCliente;

    @OneToOne
    private ImagenCliente imagenCliente;

    @ManyToMany
    @JoinTable(
            name = "DOMICILIO_CLIENTES",
            joinColumns = @JoinColumn(name = "CLIENTES_ID"),
            inverseJoinColumns = @JoinColumn(name = "DOMICILIO_ID")
    )
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();

}
