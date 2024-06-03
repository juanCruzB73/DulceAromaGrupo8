package com.DulceAromaGrupo8.DulceAromaGrupo8.repositories;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.UsuarioCliente;
import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.UsuarioEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente,Long> {
}
