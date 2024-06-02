package com.DulceAromaGrupo8.DulceAromaGrupo8.Repositories;

import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.ArticuloInsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloInsumoRepository extends JpaRepository<ArticuloInsumo,Long> {
}
