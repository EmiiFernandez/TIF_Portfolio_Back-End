
package com.portfolio.ef.Security.Repository;

import com.portfolio.ef.Security.Entity.Rol;
import com.portfolio.ef.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface iRolRepository extends JpaRepository<Rol, Integer>{
        Optional<Rol> findByRolNombre(RolNombre rolNombre);
      
}
