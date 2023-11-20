package hn.lenguajes0.examen2.servicios.impl;

import hn.lenguajes0.examen2.modelos.Canciones;
import hn.lenguajes0.examen2.repositorios.CancionesRepositorio;
import hn.lenguajes0.examen2.servicios.CancionesService;

public class CancionesServiceImpl implements CancionesService{

private CancionesRepositorio cancionesRepositorio;

    @Override
    public String eliminarCancion(int codigoCancion) {
        // TODO Auto-generated method stub
       Canciones cancionEliminar = this.cancionesRepositorio.findById(codigoCancion).get();

       if(cancionEliminar!=null){
         this.cancionesRepositorio.delete(cancionEliminar);
return "Se ha borrado la cancion";
       }

       return "No exista la cancion";
    }

    @Override
    public Canciones buscarCancionArtista(int codigoArtista) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarCancionArtista'");
    }
    
}
