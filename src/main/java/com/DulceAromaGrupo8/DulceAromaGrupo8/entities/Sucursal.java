package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Sucursal")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Sucursal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "Horario_de_apertura")
    private LocalTime horarioApertura;

    @Column(name = "Horario_de_cierre")
    private LocalTime horarioCierre;
    private boolean casaMatriz;

    @OneToOne
    private Domicilio domicilio;

    @ManyToOne
    private Empresa empresa;

    @ManyToMany(mappedBy = "sucursales")
    private List<Promocion> promociones;

    @OneToMany(mappedBy = "sucursal",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @Builder.Default
    private Set<Empleado> empleados = new HashSet<>();

    @ManyToMany
    @Builder.Default
    private Set<Categoria>categorias = new HashSet<>();

    @OneToMany
    @Builder.Default
    private Set<Pedido> pedido = new HashSet<>();

}
