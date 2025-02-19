use ssgdb;
create table test(id smallint unsigned not null auto_increment primary key, name varchar(20) not null);
select * from test;
insert into test(id, name) values (null, 'sample test data1');
show databases;