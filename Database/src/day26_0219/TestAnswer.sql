use ssgdb;
show tables;

CREATE TABLE memberTBL(
memberID VARCHAR(8) NOT NULL,
memberName NVARCHAR(5) NOT NULL,  -- korean?
memberAddress NVARCHAR(20) NULL
);

ALTER TABLE memberTBL MODIFY COLUMN memberID CHAR(8);

CREATE TABLE productTBL(
productName NCHAR(4) NOT NULL,
cost INT NOT NULL,
makeDate DATE NULL,
company NCHAR(5) NULL,
amount INT NOT NULL
);

ALTER TABLE productTBL ADD COLUMN product_ID INT NOT NULL; -- 유일한 속성을 가집니다? 가 무슨말

ALTER TABLE productTBL DROP COLUMN product_ID;

-- cost column 을 정수형 int pay 로 변경하기.
ALTER TABLE productTBL CHANGE COLUMN cost pay INT;

-- productName 뒤에 product_ID 컬럼 추가하기.
ALTER TABLE productTBL ADD COLUMN product_ID INT AFTER productName;
describe productTBL;
SELECT * from productTBL;
-- productName 앞에 product_ID 컬럼 오도록 순서 바꾸기.
ALTER TABLE productTBL MODIFY COLUMN productName NCHAR(4) AFTER product_ID;

-- pay 컬럼 뒤에 descript varchar(50) 형 컬럼 추가하기.
ALTER TABLE productTBL ADD COLUMN descript VARCHAR(50) AFTER pay;

-- descript column 을 text 타입으로 변경.
ALTER TABLE productTBL MODIFY COLUMN descript TEXT;
