
package com.portfolio.ef.Service;

import com.portfolio.ef.Model.Proyecto;
import com.portfolio.ef.Repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService {
    @Autowired
    ProyectoRepository proyectoRepository;
    
    public List<Proyecto> list() {
        return proyectoRepository.findAll();
    }
    
    public Optional<Proyecto> getOne(int id) {
        return proyectoRepository.findById(id);
    }
    
    public Optional<Proyecto> getByNombreP (String nombreP) {
        return proyectoRepository.findByNombreP(nombreP);
    }
    
    public void save(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }
    
    public void delete(int id) {
        proyectoRepository.deleteById(id);
    }
    
    public boolean existsById(int id) {
        return proyectoRepository.existsById(id);
    }
    
    public boolean existsByNombreP(String nombreP) {
        return proyectoRepository.existsByNombreP(nombreP);
    }
}
