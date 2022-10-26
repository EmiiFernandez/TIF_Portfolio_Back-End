
package com.portfolio.ef.Repository;

import com.portfolio.ef.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
