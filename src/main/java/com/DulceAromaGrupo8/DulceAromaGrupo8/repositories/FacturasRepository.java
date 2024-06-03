package com.DulceAromaGrupo8.DulceAromaGrupo8.repositories;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturasRepository extends JpaRepository<Factura,Long> {
}
