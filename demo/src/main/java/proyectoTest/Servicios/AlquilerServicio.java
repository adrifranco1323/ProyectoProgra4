package proyectoTest.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTest.Entidades.Alquiler;
import proyectoTest.Repositorios.AlquilerRepositorio;

@Service
public class AlquilerServicio {

    @Autowired
    private AlquilerRepositorio alquilerRepositorio;

    public List<Alquiler> obtenerTodosLosAlquileres() {
        return alquilerRepositorio.findAll();
    }

    public Alquiler guardarAlquiler(Alquiler alquiler) {
        return alquilerRepositorio.save(alquiler);
    }
}

