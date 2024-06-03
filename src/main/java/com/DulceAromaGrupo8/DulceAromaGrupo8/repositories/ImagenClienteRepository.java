package com.DulceAromaGrupo8.DulceAromaGrupo8.repositories;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.ImagenCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ImagenClienteRepository extends JpaRepository<ImagenCliente,Long> {
}
