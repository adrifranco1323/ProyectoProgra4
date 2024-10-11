package proyectoTest.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectoTest.Entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    // Métodos personalizados si es necesario
}