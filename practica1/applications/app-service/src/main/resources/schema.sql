DROP TABLE IF EXISTS videojuego;
create table videojuego (
id SERIAL PRIMARY KEY NOT NULL,
nombre VARCHAR(30),
descripcion VARCHAR(30),
categoria VARCHAR(30),
modalidad VARCHAR(30)
);