package com.DulceAromaGrupo8.DulceAromaGrupo8.entities;

import com.DulceAromaGrupo8.DulceAromaGrupo8.enums.FormaPago;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "Factura")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_Facturacion")
    private LocalDate fechaFacturacion;
    @Column(name = "mpPaymentId")
    private Integer mpPaymentId;
    @Column(name = "mpMerchantOrderId")
    private Integer mpMerchantOrderId;
    @Column(name = "mpPreferenceId")
    private String mpPreferenceId;
    @Column(name = "mpPaymentType")
    private String mpPaymentType;
    @Column(name = "formaPago")
    private FormaPago formaPago;
    @Column(name = "totalVenta")
    private Double totalVenta;




}
