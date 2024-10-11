-- Crear la base de datos
CREATE DATABASE libreria;

-- Usar la base de datos
USE libreria;

-- Crear tabla Autores
CREATE TABLE Autores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    biografia TEXT
);

-- Crear tabla Libros
CREATE TABLE Libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    ISBN VARCHAR(20) NOT NULL UNIQUE,
    autor_id INT,
    precio_compra DECIMAL(10, 2) NOT NULL,
    precio_alquiler DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL,
    estado ENUM('nuevo', 'usado') NOT NULL,
    FOREIGN KEY (autor_id) REFERENCES Autores(id)
);

-- Crear tabla Categorias
CREATE TABLE Categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

-- Crear tabla Libro_Categorias
CREATE TABLE Libro_Categorias (
    libro_id INT,
    categoria_id INT,
    PRIMARY KEY (libro_id, categoria_id),
    FOREIGN KEY (libro_id) REFERENCES Libros(id),
    FOREIGN KEY (categoria_id) REFERENCES Categorias(id)
);

-- Crear tabla Usuarios
CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(255) NOT NULL UNIQUE,
    contrasena_hash VARCHAR(72) NOT NULL,
    correo VARCHAR(255) NOT NULL UNIQUE,
    tipo_usuario ENUM('administrador', 'empleado', 'cliente') NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    fecha_registro DATETIME DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE Permisos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE Usuario_Permisos (
    usuario_id INT,
    permiso_id INT,
    PRIMARY KEY (usuario_id, permiso_id),
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id),
    FOREIGN KEY (permiso_id) REFERENCES Permisos(id)
);

-- Crear tabla Pedidos
CREATE TABLE Pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT,
    fecha_pedido DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    monto_total DECIMAL(10, 2) NOT NULL,
    tipo ENUM('compra', 'alquiler') NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id)
);

-- Crear tabla ItemsPedido
CREATE TABLE ItemsPedido (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_id INT,
    libro_id INT,
    cantidad INT NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES Pedidos(id),
    FOREIGN KEY (libro_id) REFERENCES Libros(id)
);

-- Crear tabla Seguros
CREATE TABLE Seguros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10, 2) NOT NULL
);

-- Crear tabla Alquileres
CREATE TABLE Alquileres (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_id INT,
    libro_id INT,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    seguro_id INT,
    FOREIGN KEY (pedido_id) REFERENCES Pedidos(id),
    FOREIGN KEY (libro_id) REFERENCES Libros(id),
    FOREIGN KEY (seguro_id) REFERENCES Seguros(id)
);