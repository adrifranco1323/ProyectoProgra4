package proyectoTest.Repositorios;
import org.springframework.data.jpa.repository.JpaRepository;

import proyectoTest.Entidades.Autor;

public interface AutorRepositorio extends JpaRepository<Autor, Long> {
    // Métodos personalizados si es necesario
}