
package com.portfolio.ef.Interface;

import com.portfolio.ef.Model.Persona;
import java.util.List;


/**
 * contendrá los métodos necesarios para el ABML;
 */


public interface IPersonaService {
    
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
    
}
