
package com.portfolio.ef.Repository;

import com.portfolio.ef.Model.Proyecto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
 public Optional<Proyecto> findByNombreP(String nombreP);
 public boolean existsByNombreP(String nombreP);


}

