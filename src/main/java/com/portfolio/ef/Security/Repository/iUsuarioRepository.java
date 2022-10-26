
package com.portfolio.ef.Security.Repository;

import com.portfolio.ef.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
   Optional<Usuario> findByNombreUsuario(String nombreUsuario);
   
   boolean existsByNombreUsuario (String nombreUsuario);
   boolean existsByEmail (String email);
}
