package hn.lenguajes0.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes0.examen2.modelos.Canciones;
import hn.lenguajes0.examen2.servicios.impl.CancionesServiceImpl;

@RestController
@RequestMapping("/api/canciones")
public class CancionesController {
@Autowired
    private CancionesServiceImpl cancionesServiceImpl;

    @DeleteMapping("/eliminar")
    public String EliminarCancion(@RequestParam (name = "codigoCancion") int codigoCancion){
        return this.cancionesServiceImpl.eliminarCancion(codigoCancion);
    }
    
}
