package proyectoTest.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectoTest.Entidades.Seguro;

public interface SeguroRepositorio extends JpaRepository<Seguro, Long> {
    // Métodos personalizados si es necesario
}
