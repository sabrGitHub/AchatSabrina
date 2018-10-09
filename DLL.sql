drop sequence id_con;
drop table client_site;
drop table vetements ;
drop table commande_site ;
create table client_site
(
id_con number ,
utilisateur varchar2(30) not null,
adresse varchar2(30) not null,
Email varchar2(30) not null,
motPasse varchar2(20) not null,
constraint connexion_id_pk primary key(id_con),
constraint conn_user_pwd_uq unique(utilisateur,motPasse)
);

create sequence id_con  minvalue 1 start with 1 cache 200;

create table commande_site (
num_com varchar2(20),
date_com date,
prixTotal number(5,2),
id_con number,
constraint commnande_num_com_pk primary key(num_com,id_con),
constraint commnande_id_con_fk foreign key(id_con) references client_site (id_con)

)


create table  vetements(
 id_vetement varchar(15) primary key,
 genre varchar(6),
 categorie varchar(15),
 nom_vetement varchar(20),
 image varchar(40),
 couleur varchar(10),
 taille varchar(4),
 prix number(5,2) default 0,
 description varchar(50)

);