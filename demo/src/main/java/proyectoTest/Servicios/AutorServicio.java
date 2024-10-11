package proyectoTest.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTest.Entidades.Autor;
import proyectoTest.Repositorios.AutorRepositorio;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;

    public List<Autor> obtenerTodosLosAutores() {
        return autorRepositorio.findAll();
    }

    public Optional<Autor> obtenerAutorPorId(Long id) {
        return autorRepositorio.findById(id);
    }

    public Autor guardarAutor(Autor autor) {
        return autorRepositorio.save(autor);
    }

    public void eliminarAutor(Long id) {
        autorRepositorio.deleteById(id);
    }
}