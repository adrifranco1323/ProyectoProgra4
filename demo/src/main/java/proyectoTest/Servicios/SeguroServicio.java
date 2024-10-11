package proyectoTest.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTest.Entidades.Seguro;
import proyectoTest.Repositorios.SeguroRepositorio;

@Service
public class SeguroServicio {

    @Autowired
    private SeguroRepositorio seguroRepositorio;

    public List<Seguro> obtenerTodosLosSeguros() {
        return seguroRepositorio.findAll();
    }

    public Seguro guardarSeguro(Seguro seguro) {
        return seguroRepositorio.save(seguro);
    }
}
