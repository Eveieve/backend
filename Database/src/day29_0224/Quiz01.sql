use madangdb;

show tables;
desc customer;

drop table customer, orders, book;

create table customer(
custid int primary key,
name varchar(40),
address varchar(50), 
phone varchar(20)
);

create table orders (
orderid int,
custid int, 
bookid int, 
saleprice int,
orderdate date,
primary key(orderid)
);

create table book(
bookid int, 
bookname varchar(40),
publisher varchar(40),
price int
);

-- how do make an attribute a primary key?
alter table book 
add primary key (bookid);

create table cust_addr(
custid int,
addrid int primary key,
address varchar(50), 
phone varchar(20), 
changeday date
);
-- how to make primary key auto_increment, when primary key is already set in a table
alter table cust_addr
modify custid int auto_increment;

alter table cust_addr auto_increment = 1;

desc cust_addr;

--
alter table cust_addr
modify custid int; -- do not auto increment

desc cust_addr; -- essentially cust_addr_history 
select * from cust_addr;
commit;
-- auto increment addrid instead of custid
alter table cust_addr
modify addrid int auto_increment; -- error;

-- to use auto_increment feature when inserting data, you must specify columns in order, 
-- and you do not need to write custid column values
INSERT INTO Cust_addr (addrid, address, phone, changeday) VALUES (1, '영국 에인트호번', '010-5000-0001', STR_TO_DATE('2003-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr (addrid, address, phone, changeday)VALUES (1, '영국 맨체스터', '010-5000-0002', STR_TO_DATE('2005-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr (addrid, address, phone, changeday) VALUES (1, '영국 에인트호번', '010-5000-0003', STR_TO_DATE('2013-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr (addrid, address, phone, changeday) VALUES (1, '영국 퀸즈파크', '010-5000-0004', STR_TO_DATE('2021-07-01','%Y-%m-%d'));
    


select * from customer;
select * from cust_addr;

-- 1. ????
select address 
from cust_addr
where custid = 1;


-- How to remove a primary key and add 2 primary keys. 
alter table cust_addr
modify custid int, 
drop primary key, 
add primary key (custid, addrid);

desc cust_addr;

select * from cust_addr;

-- How to make a column(primary key) auto_increment when data have been inserted already 
commit;
alter table cust_addr
modify addrid int auto_increment;

show create table cust_addr;

alter table cust_addr
drop primary key; -- drops all primary keys 
desc cust_addr; 
commit;
alter table cust_addr
add primary key (addrid); -- 이미 중복되는 데이터값 1  데이터 입력해서 안됨 . update data alter필요 할듯 

drop table cust_addr;

INSERT INTO Cust_addr (custid, address, phone, changeday) VALUES (1, '영국 에인트호번', '010-5000-0001', STR_TO_DATE('2003-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr (custid, address, phone, changeday)VALUES (1, '영국 맨체스터', '010-5000-0002', STR_TO_DATE('2005-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr (custid, address, phone, changeday) VALUES (1, '영국 에인트호번', '010-5000-0003', STR_TO_DATE('2013-07-01','%Y-%m-%d'));
INSERT INTO Cust_addr (custid, address, phone, changeday) VALUES (1, '영국 퀸즈파크', '010-5000-0004', STR_TO_DATE('2021-07-01','%Y-%m-%d'));

create table cust_addr(
custid int,
addrid int primary key,
address varchar(50), 
phone varchar(20), 
changeday date
);

-- primary key 한개인데 multiple primary key 라고 뜬다??
-- primary key must be the first  columns!!

drop table cust_addr;
create table cust_addr(
addrid int primary key auto_increment,
custid int,
address varchar(50), 
phone varchar(20), 
changeday date
);

-- 1. 고객번호 1의 주소 변경 내역 
select address
from cust_addr;

-- 2. 
select phone
from cust_addr;

-- 3. 
select * from cust_addr;
select phone
from cust_addr
where  min(changeday)
group by changeday;

-- 4. 가입 당시를 어떻게 찾아?

-- 5. 고객번호 1번의 카트에 저장된 도서 중 주문한 도서를 구하시오 
select * from cart;

select c.custid, b.bookname
from book b 
join orders o on o.bookid = b.bookid
join customer c on c.custid = o.custid
where c.custid = 1;

-- 6. 1번 고객의 카트에 저장된 도서중 주문하지 않은 도서 구하시오. ?????
select c.custid, o.bookid
from cart c 
left join orders o on o.bookid = c.bookid 
where c.custid = 1
and o.bookid is null;

select * from orders;

-- 7. 1번 카트에 저장된 도서의 정가 합을 구하시오. 
select * from cart;