CREATE TABLE Remedio (
    id bigint not null auto_increment primary key,
    nome varchar(100) not null,
    via varchar(100) not null,
    lote varchar(100) not null,
    quantidade int not null,
    validade varchar(100) not null,
    laboratorio varchar(100) not null
);