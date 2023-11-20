package hn.lenguajes0.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes0.examen2.modelos.InformacionContacto;
import hn.lenguajes0.examen2.repositorios.InfoContactoRepositorio;
import hn.lenguajes0.examen2.servicios.InfoContactoService;
@Service
public class InfoContactoImpl implements InfoContactoService{
    @Autowired
    private InfoContactoRepositorio infoContactoRepositorio;
 
    @Override
    public List<InformacionContacto> ObtenerTodos() {
        // TODO Auto-generated method stub
       return this.infoContactoRepositorio.findAll();
    }
    
}
