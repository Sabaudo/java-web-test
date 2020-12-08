create database dbped;
show databases;
use dbped;
CREATE TABLE pedidos(
	id int primary key auto_increment,
    cliente varchar(50) not null,
    data varchar(10) not null,
    cpf varchar(15)not null,
    email varchar(50) not null,
    nomePedido varchar(50) not null,
    quant int not null,
    valor float not null
);

show tables;
describe pedidos;




