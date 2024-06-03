package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.Estado;
import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.FormaPago;
import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "hora_Estimada_Finalizacion")
    private LocalTime horaEstimadaFinalizacion;
    @Column(name = "total")
    private Double total;
    @Column(name = "total_Costo")
    private Double totalCosto;
    @Column(name = "estado")
    private Estado estado;
    @Column(name = "tipo_Envio")
    private TipoEnvio tipoEnvio;
    @Column(name = "forma_Pago")
    private FormaPago formaPago;
    @Column(name = "Fecha_Pedido")
    private LocalDate FechaPedido;

    @OneToOne
    private Factura factura;
    @ManyToOne
    private Empleado empleado;
    @ManyToOne
    private Domicilio domicilio;
    @ManyToOne
    private Sucursal sucursal;
    @ManyToOne
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    @Builder.Default
    private Set<DetallePedido> detallePedidoSet = new HashSet<>();


}
