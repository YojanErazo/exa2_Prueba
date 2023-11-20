package hn.lenguajes0.examen2.servicios;
import java.util.List;
import hn.lenguajes0.examen2.modelos.Usuarios;

public interface UsuarioService {
    
    public Usuarios AgregarUsuario(Usuarios usuario);

    public String EliminarUsuario (int idUsuario);

    public List<Usuarios> ObtenerTodos();

    public String actualizarUsuario (int idUsuario, Usuarios usuario);

    public Usuarios BuscarUsuario(int idUsuario);


}
