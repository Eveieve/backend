-- ABS() - returns the absolute value of a number 

-- SELECT ABS(number);
select abs(-10);
select abs(5);
select abs(0);

-- Get absolute values of amounts
select id, abs(amount) as absolute_amount from transactions; 

-- ROUND() function rounds a number to the nearest integer or a specified number of decimal places. 
-- round(number, decimal_places)
select round(-4.7);
select round(4);
select round(-4.5);

select round(3.456, 2); -- 3.46 
select round(-3.456, 2); 
select round(2.34573,4); -- 2.3457

-- round to the left of decimal point 
select round(12345, -2);

-- CEIL() returns the smallest integer that is greater than or equal to the given number. It always rounds up to the next integer. 
select ceil(20), ceil(20.1), ceil(-20.5); -- 20, 21, -20

select ceil(20.4);
select ceil(-20.4);

-- FLOOR() returns the largest integer that is less than or equal to the given number
select floor(4.9), floor(4.1), floor(-3.2), floor(-3.9), floor(10.0); 
-- 4, 4, -4, -4, 10

-- TRUNCATE() function removes the decimal portion of a number withour rounding. It cuts off the digits after the specified place. 
select truncate(4.5678,2); -- 4.56 
select truncate(4.5678, 4); -- 4 

-- MOD() returns the remainder of a division operation. It is used to calculate the remainder when one number is divided by another.

-- =================== Quiz 
-- 고객별 평균 주문 금액을 백원단위로 반올림 
select * from orders;
select custid 'customer id', round(sum(saleprice)/count(*), -2) 'average price'
-- round(avg(saleprice)) is ok too 
from orders
group by custid; -- 고객별

-- same as:
select * from orders;
select custid 'customer id', round(avg(saleprice), -2) 'average price'
from orders
group by custid; -- 고객별

-- ========== String functions
-- LPAD() function left-pads a string with a specified character (or set of characters) until it reaches the desired length. 
-- LPAD(string, until this length, pad_string)
select lpad('123', 5, '0'); -- 00123
select lpad('sql', 10, ' '); --     sql 
-- > for aligning text 

-- TRIM()

-- LENGTH()

-- 
-- CHAHR_LENGTH() 

-- REPLACE()

-- SUBSTR()

-- 서점 고객 중 같은 성 가진 사람alter

-- 굿스포츠에서 출판한 도서 제목과 제목의 글자수 
select bookname 'title', char_length(bookname) char_number, length(bookname) byte_number
from book 
where publisher = '굿스포츠'

-- ======== TIME, DATE functions 

-- str_to_date()

-- DATEDIFF(date1, date2) 

-- SYSDATE or now()
select sysdate;
select now();
-- ADDDATE(date, interval)

-- DATE_FORMAT(date, format)

-- ==== DAY FUNCTIONS

-- %w
-- %W
-- %a
-- %d

-- 서점은 주문일로부터 10일 후 매출을 확정한다. 각 주문의 확정일자 구하시오. 
-- 확정일자를 계산하기 
select orderid 주문번호, orderdate 주문일, adddate(orderdate, interval 10 day) 구매확정일
from orders;

-- 8. 
-- select orderid 주문번호, date_format(orderdate
-- from orders
-- where orderdate = str_to_date('20240707', '%Y%m%d');

-- NULL 값 처리하기. 

create table mybook(
bookid int, 
price int
);

insert into mybook values (1, 10000), (2, 20000), (3, NULL);

select * from mybook;

select price + 100 
from mybook
where bookid = 3; -- NULL + number is NULL 

select sum(price), avg(price), count(*), count(price)
from mybook; -- COUNT에 NULL 은 포함되지 않음. * 은 널을 포함한다. 여긴 왜 널값인데 계산이 되는거지? 

-- HOW to check NULL value 
select * from mybook 
where price is null; -- null and ' ' is different 

-- IFNULL Function returns a specified value if an expression is NULL.If the expression is NOT NULL, it returns the original value.
-- IFNULL (expression, replacement_value)

-- 10. 
select name 이름, ifnull(phone, 'no contact') 전화번호
from customer;

select bookid as name,ifnull(price, 0) 
from mybook;

-- 11. 
set @seq:=0;
select (@seq:=@seq+1) 순번, custid, name, phone
from customer
where @seq < 2;
