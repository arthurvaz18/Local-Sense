create table usuario
(
    cpf      varchar(11) not null primary key,
    nome     varchar(50) not null,
    email    varchar(300)not null,
    senha    varchar(50)not null,
    telefone varchar(20)not null
);