use sakila;

select *
from customer
where customer_id = 2; -- 처음 읽는 스냅 샷

update customer
set email = 'patricia@gmail.com'
where customer_id = 2;

select *
from customer
where customer_id = 2;
-- 두번째 읽는 스냅 샷 -> 첫번째 스냅샷이랑 같음. (Repeatable Read), isolation 방식. mysql 은 기본적으로 repeatable read.

--


select *
from customer
limit 4;

select *
from customer
where customer_id = 2;
set session transaction isolation level read committed;

--
create table person
(
    i    int,
    name varchar(30)
);
insert into person
values (1, 'java');
select *
from person
where i = 1;

select *
from person;

update person
set name = 'green'
where i = 1;

select *
from person;

insert into person
values (2, 'ssg1');
select *
from person;

-- ?????
select *
from person;

-- dirty read

insert into person
values (5, 'ssg5');
commit;
select *
from person;

-- change to repeatable
set global transaction isolation level repeatable read;

create table account
(
    id         int primary key auto_increment,
    owner varchar(50) not null,
    balance    int      not null default 0,
    created_on datetime not null

);
insert into account values('ssg1', 80, now());

update account se balance = banalance 1-- -ie 1
