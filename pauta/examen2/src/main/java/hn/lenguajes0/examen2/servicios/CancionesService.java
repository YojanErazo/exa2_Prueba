package hn.lenguajes0.examen2.servicios;

import hn.lenguajes0.examen2.modelos.Canciones;

public interface CancionesService {
    public String eliminarCancion (int codigoCancion);

    public Canciones buscarCancionArtista(int codigoArtista);
}
