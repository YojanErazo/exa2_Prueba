package hn.lenguajes0.examen2.modelos;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios {
    
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int idUsuario;

private String nombre;
private String apellido;
private int edad;

@OneToMany
(mappedBy= "usuario", cascade = CascadeType.ALL)
private  List<Artista> artista= new ArrayList<>();

@OneToOne
(mappedBy = "usuario", cascade = CascadeType.ALL)
private Canciones canciones;
}
