package com.DulceAromaGrupo8.DulceAromaGrupo8.repositories;


import com.DulceAromaGrupo8.DulceAromaGrupo8.entities.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo,Long> {
}
