package proyectoTest.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectoTest.Entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
    // Métodos personalizados si es necesario
}