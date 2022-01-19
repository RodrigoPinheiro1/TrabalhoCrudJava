



create database projeto;

use projeto;
 
create table empresa (

id int primary key auto_increment ,
NomeEmpresa varchar(30) ,
StatusEmpresa varchar (18),
Endereco varchar(40) , 
Cnpj varchar(18) ,
Cpf varchar(14) ,
Telefone varchar(14) ,
Email varchar(40) ,
EndeSite varchar(50), 
Responsavel varchar(50), 
Anotacoes varchar(300) ,
DataContrato varchar(12),
TipoSite varchar(40) ,
ValorAtualizar double(5,3), 
imagem blob 


);

select * from empresa ;	


drop table empresa;