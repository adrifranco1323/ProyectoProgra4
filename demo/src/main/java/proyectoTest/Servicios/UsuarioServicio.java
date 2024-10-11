package proyectoTest.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyectoTest.Entidades.Usuario;
import proyectoTest.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }
}
