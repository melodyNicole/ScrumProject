/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     23/05/2016 01:48:19 p.m.                     */
/*==============================================================*/


drop table if exists LOGIN;

/*==============================================================*/
/* Table: LOGIN                                                 */
/*==============================================================*/
create table LOGIN
(
   ID_LOGIN             int not null AUTO_INCREMENT,
   USER                 varchar(55) not null,
   PASSWORD             varchar(55) not null,
   primary key (ID_LOGIN)
);

/*INSERCIÓN DE DATOS EN LA BASE */

insert into LOGIN (USER,PASSWORD) values ('andrea24','andy24');
insert into LOGIN (USER,PASSWORD) values ('lucas_13','lucasA');
insert into LOGIN (USER,PASSWORD) values ('camilaOporto','cami_oporto23');
insert into LOGIN (USER,PASSWORD) values ('martin86','martinGuzman');
insert into LOGIN (USER,PASSWORD) values ('jorgeLopez','cocolopoez');
insert into LOGIN (USER,PASSWORD) values ('danyPrez','dany5678');
insert into LOGIN (USER,PASSWORD) values ('vanessa','vanessa23');
insert into LOGIN (USER,PASSWORD) values ('gonzalo95','gonzalo_95');