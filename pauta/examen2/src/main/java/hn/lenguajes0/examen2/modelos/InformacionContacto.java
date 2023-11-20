package hn.lenguajes0.examen2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "informacioncontacto")
@AllArgsConstructor
@NoArgsConstructor
public class InformacionContacto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int codigoContacto;
    private String pais;
private String ciudad;
private String telefono;
private String correo;

@OneToOne
@JsonIgnore
@JoinColumn(name = "codigoArtista", referencedColumnName = "codigoArtista")
private Artista artista;




}
