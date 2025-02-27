use madangdb;
create table boards (
    bno             int             primary key auto_increment,
    btitle          varchar(100)    not null,
    bcontent        longtext        not null,
    bwriter         varchar(50)     not null,
    bdate           datetime        default now(), -- current time
    bfilename       varchar(50)     null,
    bfiledata		longblob			null
);