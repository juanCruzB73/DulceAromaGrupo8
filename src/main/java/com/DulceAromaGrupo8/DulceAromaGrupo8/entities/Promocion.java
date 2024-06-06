package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.TipoPromocion;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Entity
@Table(name = "Promocion")
@Data
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

    @ManyToMany
    @JoinTable(
            name = "sucursal_promocion",
            joinColumns = @JoinColumn(name = "promocion_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_id")
    )
    private List<Sucursal> sucursales;

    public void setHoraDesde(int hora, int minutos){
        this.HoraDesde = LocalTime.of(hora, minutos);
    }

    public void setHoraHasta( int hora, int minutos){
      this.HoraHasta = LocalTime.of(hora, minutos);
    }
}
