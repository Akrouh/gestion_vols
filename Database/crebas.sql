/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  23/11/2017 15:41:32                      */
/*==============================================================*/


drop table if exists Companie;

drop table if exists Vol;

/*==============================================================*/
/* Table : Companie                                             */
/*==============================================================*/
create table Companie
(
   idCompanie           varchar(254) not null,
   idVol                varchar(254) not null,
   nomCompanie          varchar(254),
   primary key (idCompanie)
);

/*==============================================================*/
/* Table : Vol                                                  */
/*==============================================================*/
create table Vol
(
   idVol                varchar(254) not null,
   description          varchar(254),
   dateVol              datetime,
   primary key (idVol)
);

alter table Companie add constraint FK_proposer foreign key (idVol)
      references Vol (idVol) on delete restrict on update restrict;

