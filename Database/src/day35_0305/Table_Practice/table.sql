use ssg;

drop table if exists product;

create table product(
    prod_code varchar(10),
    prod_num int,
    made_date datetime,
    status enum('SOLD', 'INVENTORY', 'IN_STORE'),
    primary key (prod_code, prod_num)
);