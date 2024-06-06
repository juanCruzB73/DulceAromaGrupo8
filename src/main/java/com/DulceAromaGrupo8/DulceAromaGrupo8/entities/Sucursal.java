package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Sucursal")
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

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            joinColumns = { @JoinColumn(name = "sucursal_id") },
            inverseJoinColumns = { @JoinColumn(name = "promocion_id") }
    )
    private Set<Promocion> promociones = new HashSet<>();

    @OneToMany(mappedBy = "sucursal",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @Builder.Default
    private Set<Empleado> empleados = new HashSet<>();

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "sucursales_id"),
            inverseJoinColumns = @JoinColumn(name = "categorias_id")
    )
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "sucursal_id") // nombre de la columna que hace referencia a la sucursal en la tabla Pedido
    private List<Pedido> pedidos = new ArrayList<>();

    public void setHorarioApertura(int hora, int minuto) {
        this.horarioApertura = LocalTime.of(hora, minuto);

    }

    public void setHorarioCierre(int hora, int minuto) {
        this.horarioCierre = LocalTime.of(hora, minuto);
}
}
