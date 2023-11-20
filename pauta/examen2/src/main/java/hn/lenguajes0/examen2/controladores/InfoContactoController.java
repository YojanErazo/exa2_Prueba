package hn.lenguajes0.examen2.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import hn.lenguajes0.examen2.modelos.InformacionContacto;
import hn.lenguajes0.examen2.servicios.impl.InfoContactoImpl;

@RestController
@RequestMapping("/api/infocontacto")
public class InfoContactoController {
@Autowired
    private InfoContactoImpl infoContactoImpl;

    @GetMapping("/todos")
    public List<InformacionContacto> ObtenerTodos(){
        return infoContactoImpl.ObtenerTodos();
    }

}
