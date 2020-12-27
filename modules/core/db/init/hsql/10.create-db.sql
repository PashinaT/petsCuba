-- begin PETS_USERS
create table PETS_USERS (
    ID integer not null,
    --
    login varchar(255) not null,
    password varchar(255) not null,
    --
    primary key (ID)
)^
-- end PETS_USERS
-- begin PETS_TABLE_LIST_PETS2
create table PETS_TABLE_LIST_PETS2 (
    ID integer not null,
    --
    IS_FOUND boolean,
    IMAGE longvarchar,
    COLOR_LIST_PETS varchar(255),
    VIEW_LIST_PETS varchar(255),
    NAME_LIST_PETS varchar(255),
    PETS_ID_SHELTER integer,
    --
    primary key (ID)
)^
-- end PETS_TABLE_LIST_PETS2
-- begin PETS_TABLE_SHELTER
create table PETS_TABLE_SHELTER (
    ID integer not null,
    --
    NAME_SHELTER varchar(400),
    ADDRESS_SHELTER varchar(2096),
    --
    primary key (ID)
)^
-- end PETS_TABLE_SHELTER
