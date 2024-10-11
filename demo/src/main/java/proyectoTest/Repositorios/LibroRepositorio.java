package proyectoTest.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectoTest.Entidades.Libro;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
    // Métodos personalizados si es necesario
}

