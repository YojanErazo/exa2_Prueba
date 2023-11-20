package hn.lenguajes0.examen2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "canciones")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Canciones {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int codigoCancion;

private String titulo;
private String album;
private int anyoLanzamiento;

@JsonIgnore
@ManyToOne
@JoinColumn(name = "codigoArtista", referencedColumnName = "codigoArtista")
private Artista artista;




}
