/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Instructor
 * Created: 8/08/2019
 */
create table usuario(
    cedula bigint primary key not null,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    correo varchar(50) not null,
    rol enum('admin','supervisor','user')
);


describe usuario;


INSERT INTO usuario VALUES (1111,'Yuliano','Quiñones','yq@yq.co','admin'),(2222,'Felipe','Aguilera','fa@fa.co','admin');

SELECT * FROM usuario WHERE 1;

ALTER TABLE usuario ADD COLUMN telefono BIGINT NOT NULL AFTER correo;
