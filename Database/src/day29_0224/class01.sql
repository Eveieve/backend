create table test_table(
	col_1 int, 
    col_2 varchar(50), 
    col_3 datetime

);

insert into test_table(col_1, col_2, col_3) values (1, 'testsql', '2025-02-24');
insert into test_table(col_1, col_2, col_3) values (1, 'testsql', now());
insert into test_table(col_1, col_2, col_3) values (1, 'testsql', now());
insert into test_table(col_1, col_2, col_3) values (1, 'testsql', now());

select * from test_table;

rollback;
commit;

insert into test_table(col_1) values (1);

start transaction;

insert into test_table
values(5, 'sql', now()), (6, 'sql', now()), (7, 'sql', now());

-- col1의 컬럼 속성 변경하기. 데이터 타입 바꾸고 not null	 추가. 
alter table test_table modify col_1 smallint not null;

select * from test_table;

-- update
update test_table set col_2 = 'sql_update'; -- warn: you are using safe update mode and you tried to update a table without a WHERE that uses a KEY column

update test_table set col_2 = 'sql_update' where col_1 = 1; -- warn: fetches multiple tuples 
-- Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column.  To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.

update test_table set col_2 = 'sql_update' where col_1 = 5; 
-- Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column.  To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.

-- 

create table newbook (  
  bookid integer, 
  bookname varchar(20),
  publisher varchar(20), 
  price integer, 
  primary key(bookid)
);

insert into newbook(bookid, bookname, publisher, price) 
values (21, 'helloworld', 'bookworld', 20000);

insert into newbook(bookid, bookname, publisher, price) 
values (2, 'java', 'bookworm', 13000), 
 (5, 'sql', 'bookworld', 2100), 
 (7, 'spring', 'bookworm', 12000);

create table NewCustomer(
	custid int primary key, 
    name varchar(40), 
    address varchar(40), 
    phone varchar(30)
);

create table NewOrders(
orderid int,
custid int not null, 
bookid int not null, 
saleprice int, 
orderdate date, 
primary key (orderid),
foreign key (custid) references NewCustomer(custid),
foreign key (bookid) references newbook(bookid)
);

alter table newbook
add column isbn varchar(30);

alter table newbook 
modify column isbn int;

-- delete column 
alter table newbook
drop column isbn;

-- change bookid attribute to primary key 
alter table newbook 
add primary key (bookid);

drop table newbook;

drop table NewCustomer;
-- Error Code: 3730. Cannot drop table 'newcustomer' referenced by a foreign key constraint 'neworders_ibfk_1' on table 'NewOrders'.

select * from newbook;

select * from information_schema.table_constraints where table_name = 'neworders';

alter table neworders drop foreign key neworders_ibfk_1;
alter table neworders drop foreign key neworders_ibfk_2;

alter table neworders add constraint fk_bookid foreign key (custidid) references book(bookid) on delete cascade;

insert into newbook (bookid, bookname, publisher, price)
values (11, '스포츠의학', '한솔의학서적', 90000);

insert into newbook (bookid, bookname, publisher, price)
values (14, '스포츠의학', '한솔의학서적', null);

select * from newcustomer;

--

use madangdb;

show full tables;

update customer
set address = 'korea busan'
where custid = 5;

select * from customer;
select * from book;

-- update book
-- set publisher = (
-- 	select publisher 
--     from book
--     where bookid = 21
-- )
-- where bookid = 14;

-- Error Code: 1093. You can't specify target table 'book' for update in FROM clause

set @publisher = (select publisher from book where bookid = 21);

update book 
set publisher = @publisher
where bookid = 14;

select * from book;

