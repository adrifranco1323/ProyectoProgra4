package proyectoTest.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTest.Entidades.Categoria;
import proyectoTest.Repositorios.CategoriaRepositorio;

@Service
public class CategoriaServicio {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaRepositorio.findAll();
    }

    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }
}
