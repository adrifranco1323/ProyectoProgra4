package proyectoTest.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import proyectoTest.Entidades.ItemPedido;

public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido, Long> {
    // Métodos personalizados si es necesario
}
