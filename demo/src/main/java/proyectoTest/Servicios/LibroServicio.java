package proyectoTest.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTest.Entidades.Libro;
import proyectoTest.Repositorios.LibroRepositorio;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    public List<Libro> obtenerTodosLosLibros() {
        return libroRepositorio.findAll();
    }

    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libroRepositorio.findById(id);
    }

    public Libro guardarLibro(Libro libro) {
        return libroRepositorio.save(libro);
    }

    public void eliminarLibro(Long id) {
        libroRepositorio.deleteById(id);
    }
}
