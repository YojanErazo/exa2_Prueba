package hn.lenguajes0.examen2.servicios;

import java.util.List;
import hn.lenguajes0.examen2.modelos.Artista;

public interface ArtistaService {
    public Artista guardarArista(Artista artista);

    public String eliminarArtista (int codigoArtista);

    public List<Artista> ObtenerTodos();

    public String actualizarArtista(int codigoArtista, Artista artista);

    public Artista buscArtista(int codigoArtista);

    
}
