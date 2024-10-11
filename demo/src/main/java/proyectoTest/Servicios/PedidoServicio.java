package proyectoTest.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTest.Entidades.Pedido;
import proyectoTest.Repositorios.PedidoRepositorio;

@Service
public class PedidoServicio {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoRepositorio.findAll();
    }

    public Pedido guardarPedido(Pedido pedido) {
        return pedidoRepositorio.save(pedido);
    }
}
