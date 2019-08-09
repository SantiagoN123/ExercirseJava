/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Instructor
 * Created: 8/08/2019
 */
go
drop table usurio
go
create table usuario(
    cedula bigint primary key not null,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    correo varchar(50) not null,
    rol enum('admin','supervisor','user')
);
go
describe usuario;

insert into usuario values (10010, 'santigo', 'neira', 'Santiagoneira2010@gmail.com', 'admin');
insert into usuario values (1002736, 'Miguel', 'Avila', 'mi2017avila@gmail.com','user');

select * from usuario where 1;
go