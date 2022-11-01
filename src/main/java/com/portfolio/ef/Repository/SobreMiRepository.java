
package com.portfolio.ef.Repository;

import com.portfolio.ef.Model.SobreMi;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
public interface SobreMiRepository extends JpaRepository<SobreMi, Integer>{

    public Optional<SobreMi> findByDescripcionSM(String descripcionSM);
    public boolean existsByDescripcionSM(String descripcionSM);
}

