package hn.lenguajes0.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes0.examen2.modelos.Artista;
import hn.lenguajes0.examen2.repositorios.ArtistaRepositorio;
import hn.lenguajes0.examen2.servicios.ArtistaService;
@Service
public class ArtistaServiceImpl implements ArtistaService {
     @Autowired
    private ArtistaRepositorio artistaRepositorio;

    @Override
    public Artista guardarArista(Artista artista) {
        Artista nuevoArtista= this.artistaRepositorio.save(artista);
        return nuevoArtista;
    }

    @Override
    public String eliminarArtista(int codigoArtista) {
        Artista artistaEliminado = this.artistaRepositorio.findById(codigoArtista).get();
      if(artistaEliminado!=null){
this.artistaRepositorio.delete(artistaEliminado);
return "Se ha eliminado el artista";
      }
      return "No existe ese artista"; 
    }

    @Override
    public List<Artista> ObtenerTodos() {
        // TODO Auto-generated method stub
        return this.artistaRepositorio.findAll();
    }

    @Override
    public String actualizarArtista(int codigoArtista, Artista artista) {
        // TODO Auto-generated method stub
        Artista artistaActualizado= this.artistaRepositorio.findById(codigoArtista).get();
        if(artistaActualizado!=null){
        artistaActualizado.setNombreArtistico(artista.getNombreArtistico());
       this.artistaRepositorio.save(artistaActualizado);
       return "Se ha actuailizado el artista";
        }   

        return "No existe el artista";
   
    }

    @Override
    public Artista buscArtista(int codigoArtista) {
       return this.artistaRepositorio.findById(codigoArtista).get();
    }
    
}
