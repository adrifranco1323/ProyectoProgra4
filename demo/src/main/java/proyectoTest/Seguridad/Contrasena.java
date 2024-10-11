package proyectoTest.Seguridad;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Contrasena {
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String encodePassword(String rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }

    public boolean matchPassword(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}