package hn.lenguajes0.examen2.modelos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "artista")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "codigoArtista")
    private int codigoArtista;

    private String nombreArtistico;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;


@OneToOne
    (mappedBy = "artista", cascade = CascadeType.ALL)
    private InformacionContacto infoContacto;

@OneToMany
(mappedBy= "artista", cascade = CascadeType.ALL)
private List<Canciones> canciones = new ArrayList<>();


}
