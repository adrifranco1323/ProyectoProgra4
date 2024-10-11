package proyectoTest.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



    @Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    
    @Column(unique = true)
    private String ISBN;
    
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
    
    private double precioCompra;
    
    private double precioAlquiler;
    
    private int stock;
    
    @Enumerated(EnumType.STRING)
    private Estado estado;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public Autor getAutor() {
            return autor;
        }

        public void setAutor(Autor autor) {
            this.autor = autor;
        }

        public double getPrecioCompra() {
            return precioCompra;
        }

        public void setPrecioCompra(double precioCompra) {
            this.precioCompra = precioCompra;
        }

        public double getPrecioAlquiler() {
            return precioAlquiler;
        }

        public void setPrecioAlquiler(double precioAlquiler) {
            this.precioAlquiler = precioAlquiler;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public Estado getEstado() {
            return estado;
        }

        public void setEstado(Estado estado) {
            this.estado = estado;
        }

    // Enum para el estado del libro
    public enum Estado {
        NUEVO, USADO
    }

    
}
