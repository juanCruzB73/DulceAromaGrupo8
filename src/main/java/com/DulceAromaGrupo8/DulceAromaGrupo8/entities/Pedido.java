package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.enums.Estado;
import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.enums.FormaPago;
import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {

    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate FechaPedido;


}
