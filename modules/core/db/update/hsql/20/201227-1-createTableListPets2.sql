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
);