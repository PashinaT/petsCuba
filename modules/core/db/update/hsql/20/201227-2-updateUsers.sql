alter table PETS_USERS alter column UUID rename to UUID__U27211 ^
alter table PETS_USERS add column PASSWORD varchar(255) ^
update PETS_USERS set PASSWORD = '' where PASSWORD is null ;
alter table PETS_USERS alter column PASSWORD set not null ;
-- alter table PETS_USERS add column LOGIN varchar(255) ^
-- update PETS_USERS set LOGIN = <default_value> ;
-- alter table PETS_USERS alter column LOGIN set not null ;
alter table PETS_USERS add column LOGIN varchar(255) ;
