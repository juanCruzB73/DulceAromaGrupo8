package com.DulceAromaGrupo8.DulceAromaGrupo8.repositories;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
