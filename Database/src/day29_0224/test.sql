-- 02-25-2025 - morning test

-- How to use check in mysql 
-- analyze your table first!

show databases;
use testdb;
create table 극장(
극장번호 int check (극장번호 between 1 and 10),
극장이름 varchar(20), 
위치 varchar(10),
primary key(극장번호)
);

-- Can a key be primary and foreign key at the same time? 
create table 상영관(
극장번호 int, 
상영관번호 int check (상영관번호 between 1 and 10), 
영화제목 varchar(20), 
가격 int, 
좌석수 int,
primary key (상영관번호, 극장번호), -- 복합키 
foreign key (극장번호) references 극장(극장번호)
);
desc 상영관;

create table 고객(
고객번호 int, 
이름 varchar(10), 
주소 varchar(10),
primary key (고객번호)
);
desc 고객;

create table 예약(
극장번호 int, 
상영관번호 int, -- 다른 테이블 기본키 참조하는 외래키인데 첵을 해줘야 하나?
고객번호 int, 
날짜 datetime,
foreign key (극장번호) references 극장(극장번호), 
foreign key (상영관번호) references 상영관(상영관번호),
foreign key (고객번호) references 고객(고객번호), -- ! 이름 지정해서 외래키 지정해보기. 
primary key (극장번호, 상영관번호, 고객번호) -- 복합키 - 결합하여 유일한 값 만들기 
); 
desc 예약;

-- 같은 사람이 같은 좌석번호를 두번 예약하지 않아야 한다 => 고객번호, 좌석번호쌍이 중복되면 안됨. 

-- make a column auto increment 
alter table 극장 
modify 극장번호 int auto_increment; -- Error Code: 3818. Check constraint '극장_chk_1' cannot refer to an auto-increment column.
-- > you cannot use CHECK constraint and AUTO_INCREMENT in the same column 

insert into 극장 
values (1, 'lotte', 'jamsil'),
(2, 'mega', 'gangnam'), 
(3, 'daehan', 'jamsil');
select * from 극장;

insert into 상영관
values(1, 1, 'difficult movie', 15000, 48),
(3, 1, 'awesome movie', 7500, 120),
(3, 2, 'fun movie', 8000, 110);
select * from 상영관;




SELECT *
FROM information_schema.TABLE_CONSTRAINTS
WHERE TABLE_NAME in('극장', '상영관', '예약', '고객');

-- 집계 질의 
-- 1.극장의 수? 
select * from 극장;
select count(극장번호) -- it's a primary key so you can count number of vaulues on this attribute 
from 극장;

-- 2. 영화의 평균 가격? 
select * from 상영관;

select avg(가격)
from 상영관;

-- 3.2024-09-01에 영화 관람 고객 수 
select * from 예약;

-- add a column 
alter table 예약
add column 좌석번호 int;
-- > this adds a column at the end 

-- move a column to a specific place 
alter table 예약
modify column 좌석번호 int
after 고객번호;


insert into 예약 
values (3, 2, 3, 15, '2024-09-01'), 
(3, 1, 4, 16, '2024-09-01'), 
(1, 1, 9, 48, '2024-09-01');
-- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`testdb`.`예약`, CONSTRAINT `예약_ibfk_3` FOREIGN KEY (`고객번호`) REFERENCES `고객` (`고객번호`))

-- 고객 테이블 데이터 안넣었음 
insert into 고객 
values (3, 'gildong', 'gangnam'), 
(4, 'cheolsoo', 'jamsil'), 
(9, 'yeonghee', 'gangnam');
select * from 고객;

-- 다시 데이터 넣어보기. 
insert into 예약 
values (3, 2, 3, 15, '2024-09-01'), 
(3, 1, 4, 16, '2024-09-01'), 
(1, 1, 9, 48, '2024-09-01');


-- 3.2024-09-01에 영화 관람 고객 수 
select * from 예약;
select count(고객번호)
from 예약
where 날짜 = '2024-09-01';

-- 4. 대한극장에서 상영된 영화제목 
select * from 상영관; -- 영화제목 
select * from 극장; -- 극장이름 

select 상영관.영화제목 
from 상영관 
join 극장 on 극장.극장번호 = 상영관.극장번호
where 극장.극장이름 = 'daehan';

-- 5. 대한극장에서 영화 본 고객 이름 
-- 고객이름 셀렉트 
-- 고객이름이 있는 테이블에서 
-- 조인 다른테이블 온 조인조건 
select * from 고객;
select 고객.이름, 극장.극장이름
from 고객 
join 예약 on 예약.고객번호 = 고객.고객번호 
join 극장 on 극장.극장번호 = 예약.극장번호 
where 극장.극장이름 = 'daehan';

-- 6. 대한극장의 전체 수입
select * from 상영관; -- 가격 정보 

select sum(상영관.가격) as 수입 
from 상영관 
join 극장 on 극장.극장번호 = 상영관.극장번호 
where 극장.극장이름 = 'daehan';

-- constraint 어떻게 추가해서 넣는지 메모하기. 

-- 7. 극장별 상영관 수 -- 극장에 상영관이 몇개 있다는 정보가 없는데? -- 1~ 10 개 있을 수 있고 오픈한 것만 세면 됨. 
-- select count() as 상영관수, 극장이름?
-- from 극장 
-- group by 극장이름;

-- 8. 잠실에 있는 극장의 상영관
select 상.상영관번호 -- 이름은 상영관 테이블에 없음. 
from 상영관 상 
join 극장 극 on 극.극장번호 = 상.극장번호
where 극.위치 = 'jamsil';

-- 고객번호, 좌석번호 쌍이 유니크해야 함 
-- primary key (고객번호, 좌석번호, 극장번호) -- 프라이머리 키가 두개일 수 없음. 
-- primary key (고객번호, 좌석번호)
-- Unique (고객번호, 좌석번호) -- 프라이머리 키를 이런식으로 지정해줘도 됨 - 같은 사람이 같은 좌석 예약할 수 없다는 조건을 유니크로도 가능. 

-- 9. 2024년 9월 1일 극장별 평균- 관람 고객 수 - 이날 관람한 총 사람들 수 / 
-- where 절은 group by 전에 와야됨. 
select 극.극장이름, count(예.고객번호)
from 예약 예 
join 극장 극 on 극.극장번호 = 예.극장번호
where 예.날짜 = '2024-09-01'
group by 극.극장이름;

-- 10. 2024년에 가장 많은 고객이 관람한 영화 
select 상.영화제목, count(예.고객번호) as 관람수
from 상영관 상 
join 예약 예 on 예.극장번호 = 상.극장번호 
where 예.날짜 = '2024-09-01'
group by 상.영화제목; -- 틀렸음. 

-- 가장 많은 고객이 관람한 영화 

-- select max(예.고객번호),
--  (select 상.영화제목, count(예.고객번호) as 관람수
-- 	from 상영관 상 
-- 	join 예약 예 on 예.극장번호 = 상.극장번호 
-- 	where 예.날짜 = '2024-09-01'
-- 	group by 상.영화제목)
-- from 예약 예;
-- > 서브 쿼리가 여러개를 반환. 서브 쿼리를 단일 값만 반환해야 함. 

-- 10. 
select 상.영화제목, count(예.고객번호) as 관람수
from 상영관 상 
join 예약 예 on 예.극장번호 = 상.극장번호
where 예.날짜 = '2024-09-01'
group by 상.영화제목
order by 관람수 desc
limit 1; 

-- 판매원 데이터베이스 
create table Salesperson (
name varchar(20) not null, 
age int not null, 
salary bigint not null,
primary key (name)
);

create table Customer(
name varchar(20) not null, 
city varchar(20) not null, 
industrytype varchar(20) not null, 
primary key (name)
);

create table Orders(
number int not null, 
custname varchar(20) not null, 
salesperson varchar(20) not null, 
amount int not null,
constraint fk_orders_custname foreign key(custname) references Customer(name),
constraint fk_orders_salesperson foreign key(salesperson) references Salesperson(name)
);
desc orders;

-- 데이터 삽입 
-- Salesperson 데이터 삽입
INSERT INTO Salesperson (name, age, salary) VALUES
('Alice', 30, 55000.00),
('Bob', 35, 62000.00),
('Charlie', 40, 70000.00);

-- Customer 데이터 삽입
INSERT INTO Customer (name, city, industrytype) VALUES
('TechCorp', 'New York', 'Technology'),
('AutoWorld', 'Los Angeles', 'Automobile'),
('Foodies', 'Chicago', 'Food');

-- Orders 데이터 삽입
INSERT INTO Orders (number, custname, salesperson, amount) VALUES
(101, 'TechCorp', 'Alice', 15000.00),
(102, 'AutoWorld', 'Bob', 22000.00),
(103, 'Foodies', 'Charlie', 18000.00),
(104, 'TechCorp', 'Bob', 12000.00),
(105, 'AutoWorld', 'Alice', 17000.00);

select * from Salesperson;
select * from Customer;
select * from Orders;

-- 모든 판매원의 이름과 급여 
select distinct name, salary -- 중복 이름은 제거. 
from Salesperson;

-- 40세미만 판매원 이름 
select name 
from salesperson 
where age < 40;

-- s로 끝나느 도시에 사는 고객 이름 
select name, city
from customer 
where city like("%s");

-- 주문한 고객 수 (중복 제외) 
select distinct custname
from orders;

-- 판매원 각각에 대한 주문 수 


