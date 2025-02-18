CREATE DATABASE shopdb;
use shopdb;
CREATE TABLE memberTBL (
memberID varchar(8) NOT NULL,
memberName varchar(10) NOT NULL,
memberAddress varchar(20) NULL
);
CREATE TABLE productTBL (
productName VARCHAR(4) NOT NULL,
cost INT NOT NULL,
makeDate DATE NULL

use shopdb;

desc productTBL;

alter table productTBL ADD COLUMN productID int not null unique;

show tables;
select * from productTBL;

alter table productTBL drop column productID; -- 컬럼 삭제 하는 테이블 변경 작업 

ALTER TABLE productTBL CHANGE COLUMN cost price int; -- cost 컬럼을 price로 바꾸겠다, 타입은 int 

-- productName 컬럼 앞에 새로운 컬럼 productID 컬럼 추가하기. 
ALTER TABLE productTBL ADD COLUMN productID int not null first; -- productID 컬럼을 제일 앞 컬럼으로 보낸다, 타입은 int 

-- 지정된 컬럼 뒤에 컬럼 추가하기. 
ALTER TABLE productTBL ADD COLUMN descript varchar(100) not null after price; -- price 컬럼 뒤에 descript 란 컬럼을 추가한다. 문자열 100자리, not null 

-- 컬럼의 타입 변경하기. 
ALTER TABLE productTBL MODIFY COLUMN price SMALLINT; -- price 컬럼의 타입을 SMALLINT 로 바꾼다. 
