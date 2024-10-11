-- Usar la base de datos
USE libreria;

INSERT INTO Autores (nombre, biografia) VALUES
('Gabriel García Márquez', 'Escritor colombiano, premio Nobel de Literatura en 1982.'),
('J.K. Rowling', 'Autora británica, famosa por la serie Harry Potter.'),
('Stephen King', 'Escritor estadounidense de novelas de terror y suspense.');

INSERT INTO Libros (titulo, ISBN, autor_id, precio_compra, precio_alquiler, stock, estado) VALUES
('Cien años de soledad', '9780307474728', 1, 25.99, 5.99, 50, 'nuevo'),
('Harry Potter y la piedra filosofal', '9788478884459', 2, 19.99, 4.99, 100, 'nuevo'),
('El resplandor', '9788497593793', 3, 22.99, 5.99, 30, 'usado');


INSERT INTO Categorias (nombre) VALUES
('Ficción'),
('Fantasía'),
('Terror');

INSERT INTO Libro_Categorias (libro_id, categoria_id) VALUES
(1, 1),
(2, 2),
(3, 3);


-- Insertar permisos
INSERT INTO Permisos (nombre) VALUES
('gestionar_productos'),
('gestionar_usuarios'),
('gestionar_pedidos'),
('realizar_compras');

-- Insertar usuarios
INSERT INTO Usuarios (nombre_usuario, contrasena_hash, correo, tipo_usuario, nombre, apellido) VALUES
('admin', 'hash_de_contrasena', 'admin@tecnosmart.com', 'administrador', 'Admin', 'Principal'),
('empleado1', 'hash_de_contrasena', 'empleado1@tecnosmart.com', 'empleado', 'Empleado', 'Uno'),
('cliente1', 'hash_de_contrasena', 'cliente1@email.com', 'cliente', 'Cliente', 'Uno');

-- Asignar permisos
INSERT INTO Usuario_Permisos (usuario_id, permiso_id) VALUES
(1, 1), (1, 2), (1, 3), (1, 4), -- Admin tiene todos los permisos
(2, 1), (2, 3), -- Empleado puede gestionar productos y pedidos
(3, 4); -- Cliente solo puede realizar compras

INSERT INTO Pedidos (usuario_id, fecha_pedido, monto_total, tipo) VALUES
(1, '2024-10-11 10:30:00', 45.98, 'compra'),
(2, '2024-10-11 14:45:00', 4.99, 'alquiler');


INSERT INTO ItemsPedido (pedido_id, libro_id, cantidad, precio) VALUES
(1, 1, 1, 25.99),
(1, 2, 1, 19.99),
(2, 2, 1, 4.99);


INSERT INTO Seguros (nombre, descripcion, precio) VALUES
('Seguro Básico', 'Cubre daños menores y pérdida', 5.99),
('Seguro Premium', 'Cubre todo tipo de daños y pérdida', 9.99);


INSERT INTO Alquileres (pedido_id, libro_id, fecha_inicio, fecha_fin, seguro_id) VALUES
(2, 2, '2024-10-11', '2024-10-25', 1);

