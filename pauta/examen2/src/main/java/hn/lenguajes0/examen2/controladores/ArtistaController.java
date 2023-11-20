package hn.lenguajes0.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import hn.lenguajes0.examen2.modelos.Artista;
import hn.lenguajes0.examen2.modelos.Canciones;

import hn.lenguajes0.examen2.servicios.impl.ArtistaServiceImpl;

@RestController
@RequestMapping("/api/artista")
public class ArtistaController {

@Autowired
private ArtistaServiceImpl artistaServiceImpl;

@PostMapping("/crear")
public Artista guardArtista (@RequestBody Artista nvoArtista){
//if(nvoArtista.getCanciones()!=null){
    //nvoArtista.getCanciones().setArtista(nvoArtista);
//} esto es cuando sea 1 a 1
if(nvoArtista.getCanciones()!=null){

    for(Canciones canciones : nvoArtista.getCanciones()){
        canciones.setArtista(nvoArtista);
    }
}

return this.artistaServiceImpl.guardarArista(nvoArtista);

}

@GetMapping("/todos")
public List<Artista> ObtenerTodos(){
    return this.artistaServiceImpl.ObtenerTodos();
}


@DeleteMapping("/eliminar")
public String eliminarArtista (@RequestParam (name="codigoArtista") int codigoArtista){

return this.artistaServiceImpl.eliminarArtista(codigoArtista);
}

@PutMapping ("/actualizar")
public String actualizarArtista (@RequestParam (name = "codigoArtista") int codigoArtista, 
                                @RequestBody Artista artista){
return this.artistaServiceImpl.actualizarArtista(codigoArtista, artista);

                                }

}

