-- update PETS_USERS set LOGIN = <default_value> where LOGIN is null ;
alter table PETS_USERS alter column LOGIN set not null ;
