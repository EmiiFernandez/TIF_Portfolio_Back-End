
package com.portfolio.ef.Repository;

import com.portfolio.ef.Model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer> {
 public Optional<Educacion> findByNombreE(String nombreE);
 public boolean existsByNombreE(String nombreE);
    
}
