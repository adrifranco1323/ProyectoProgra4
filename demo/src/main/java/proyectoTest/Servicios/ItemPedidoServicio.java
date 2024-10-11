package proyectoTest.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTest.Entidades.ItemPedido;
import proyectoTest.Repositorios.ItemPedidoRepositorio;

@Service
public class ItemPedidoServicio {

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    public List<ItemPedido> obtenerTodosLosItemsPedido() {
        return itemPedidoRepositorio.findAll();
    }

    public ItemPedido guardarItemPedido(ItemPedido itemPedido) {
        return itemPedidoRepositorio.save(itemPedido);
    }
}

