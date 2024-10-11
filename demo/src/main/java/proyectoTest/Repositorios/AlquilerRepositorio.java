package proyectoTest.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectoTest.Entidades.Alquiler;

public interface AlquilerRepositorio extends JpaRepository<Alquiler, Long> {
    // Métodos personalizados si es necesario
}
