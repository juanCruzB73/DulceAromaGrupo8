package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Promocion {
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private tipoPromocion TipoPromocion; //enums
}
