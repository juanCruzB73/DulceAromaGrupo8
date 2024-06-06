package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.TipoPromocion;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "Promocion")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Promocion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    @Column(name = "fecha_desde")
    private LocalDate FechaDesde;
    @Column(name = "fecha_hasta")
    private LocalDate FechaHasta;
    @Column(name = "hora_desde")
    private LocalTime HoraDesde;
    @Column(name = "hora_hasta")
    private LocalTime HoraHasta;
    @Column(name = "descripcion_descuento")
    private String descripcionDescuento;
    @Column(name = "precio_promocional")
    private double precioPromocional;
    @Column(name = "tipo_promocion")
    private TipoPromocion tipoPromocion; //enums

    @ManyToMany(mappedBy = "promociones")
    private Set<Sucursal> sucursales = new HashSet<>();


    public void setHoraDesde(int hora, int minutos){
        this.HoraDesde = LocalTime.of(hora, minutos);
    }

    public void setHoraHasta( int hora, int minutos){
      this.HoraHasta = LocalTime.of(hora, minutos);
    }
    @OneToMany(mappedBy = "promocion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PromocionDetalle> detalles = new HashSet<>();

}
