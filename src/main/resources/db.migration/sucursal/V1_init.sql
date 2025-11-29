CREATE TABLE hibernate_sequence (
    next_val BIGINT
);

INSERT INTO hibernate_sequence (next_val) VALUES (1);


CREATE TABLE IF NOT EXISTS producto_pintura_sucursal (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    marca VARCHAR(150),
    precio_final INT NOT NULL,
    tipo_pintura VARCHAR(255) NOT NULL,
    color VARCHAR(255) NOT NULL,
    stock INT NOT NULL
);

CREATE TABLE IF NOT EXISTS producto_otro_sucursal (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255),
    marca VARCHAR(150),
    precio_final INT NOT NULL,
    stock INT NOT NULL
);

CREATE TABLE IF NOT EXISTS stock_producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    producto_id BIGINT NOT NULL,
    stock INT NOT NULL
);
