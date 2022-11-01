
package com.portfolio.ef.Service;

import com.portfolio.ef.Model.SobreMi;
import com.portfolio.ef.Repository.SobreMiRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SobreMiService  {
      
    @Autowired
    SobreMiRepository sobreMiRepository;
    
    public List<SobreMi> list(){
        return sobreMiRepository.findAll();
    }
    
    public Optional<SobreMi> getOne(int id){
        return sobreMiRepository.findById(id);
    }
    
    public Optional<SobreMi> getByDescripcionSM(String descripcionSM){
        return sobreMiRepository.findByDescripcionSM(descripcionSM);
    }
    
    public void save(SobreMi sobreMi){
        sobreMiRepository.save(sobreMi);
    }
    
    public void delete(int id){
        sobreMiRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return sobreMiRepository.existsById(id);
    }
    
    public boolean existsByDescripcionSM(String descripcionSM){
        return sobreMiRepository.existsByDescripcionSM(descripcionSM);
    }
}

