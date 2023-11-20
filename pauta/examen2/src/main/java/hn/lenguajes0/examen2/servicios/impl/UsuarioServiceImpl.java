package hn.lenguajes0.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes0.examen2.modelos.Usuarios;
import hn.lenguajes0.examen2.repositorios.UsuarioRepositorio;
import hn.lenguajes0.examen2.servicios.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
   private UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuarios AgregarUsuario(Usuarios usuario) {
        // TODO Auto-generated method stub
        Usuarios nvoUsuario= this.usuarioRepositorio.save(usuario)
        return nvoUsuario;
    }

    @Override
    public String EliminarUsuario(int idUsuario) {
        Usuarios usuarioEliminar = this.usuarioRepositorio.findById(idUsuario).get();
        if(usuarioEliminar!=null){
         this.usuarioRepositorio.delete(usuarioEliminar);
         return "Se ha eliminado el usuario";
        }
        return "no existe";
    }

    @Override
    public List<Usuarios> ObtenerTodos() {
       
    }

    @Override
    public String actualizarUsuario(int idUsuario, Usuarios usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarUsuario'");
    }

    @Override
    public Usuarios BuscarUsuario(int idUsuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'BuscarUsuario'");
    }
    
}
