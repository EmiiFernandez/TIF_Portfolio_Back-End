package com.portfolio.ef.Controller;

import com.portfolio.ef.Dto.DtoSobreMi;
import com.portfolio.ef.Model.SobreMi;
import com.portfolio.ef.Security.Controller.Mensaje;
import com.portfolio.ef.Service.SobreMiService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sobremi")
@CrossOrigin(origins = {"https://front-ef.web.app", "http://localhost:4200"})
public class SobreMiController  {
     @Autowired
    SobreMiService sobreMiService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<SobreMi>> list() {
        List<SobreMi> list = sobreMiService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<SobreMi> getById(@PathVariable("id") int id) {
        if (!sobreMiService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        
        SobreMi sobreMi = sobreMiService.getOne(id).get();
        return new ResponseEntity(sobreMi, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sobreMiService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        sobreMiService.delete(id);
        return new ResponseEntity(new Mensaje("Descripición eliminada"), HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoSobreMi dtoSobreMi) {
        if (StringUtils.isBlank(dtoSobreMi.getDescripcionSM())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sobreMiService.existsByDescripcionSM(dtoSobreMi.getDescripcionSM())) {
            return new ResponseEntity(new Mensaje("El nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        SobreMi sobreMi = new SobreMi(dtoSobreMi.getDescripcionSM());
        sobreMiService.save(sobreMi);

        return new ResponseEntity(new Mensaje("Skill creada exitosamente"), HttpStatus.OK);
    }
    

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoSobreMi dtoSobreMi) {
        //Validamos si existe el ID
        if (!sobreMiService.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
         //Compara nombre
        if (sobreMiService.existsByDescripcionSM(dtoSobreMi.getDescripcionSM()) && sobreMiService.getByDescripcionSM(dtoSobreMi.getDescripcionSM()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("La descripción ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtoSobreMi.getDescripcionSM())) {
            return new ResponseEntity(new Mensaje("Es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        SobreMi sobreMi = sobreMiService.getOne(id).get();
        sobreMi.setDescripcionSM(dtoSobreMi.getDescripcionSM());
    

        sobreMiService.save(sobreMi);
        return new ResponseEntity(new Mensaje("Descripción Actualizada"), HttpStatus.OK);
    }
}

