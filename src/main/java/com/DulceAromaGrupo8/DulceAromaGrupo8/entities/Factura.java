package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.enums.FormaPago;

import java.text.Normalizer;
import java.time.LocalDate;

public class Factura {

    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;




}