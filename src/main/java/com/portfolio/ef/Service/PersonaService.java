
package com.portfolio.ef.Service;

import com.portfolio.ef.Interface.IPersonaService;
import com.portfolio.ef.Model.Persona;
import com.portfolio.ef.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = personaRepository.findAll();
        return persona;   
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
    Persona persona = personaRepository.findById(id).orElse(null);
        return persona;    
    }
}
