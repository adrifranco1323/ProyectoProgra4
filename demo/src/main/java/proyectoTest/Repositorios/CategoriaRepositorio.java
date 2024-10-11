package proyectoTest.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectoTest.Entidades.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
    // Métodos personalizados si es necesario
}
