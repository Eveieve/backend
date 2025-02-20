use madangdb;
select * from customer, orders;

select count(custid) from customer;
select count(orderid) from orders;

-- 조건이 없는 테이블간의 조인을 크로스 조인이라 한다.

-- 이너조인은 교집합이다.

-- 3.22 고객과 고객의 주문에 관한 데이터를 모두 출력하기.
-- customer who have ordered. customer name and their orderids
select name, orderid -- 정답.
from customer, orders
where customer.custid = orders.custid; -- customer's custid and orders custid same meaning you are extracting customer's who have placed orders.

-- error
select name, orderid, custid -- error : custid is ambiguous. why??
from customer, orders
where customer.custid = orders.custid;

-- 3.23 고객의 이름과  고객이 주문한 책의 판매가격
select c.name, o.saleprice -- 먼저 별칭을 사용하여 테이블 부르기.
from customer c, orders o
where c.custid = o.custid;

select customer.name, orders.saleprice
from customer, orders
where customer.custid = orders.custid; -- filter customers who have placed an order

-- 3.24 고객별 총 매출액을 계산하기.
select c.name, sum(saleprice) -- saleprice 컬럼을 다 더하고, customer 테이블의 name 컬럼 가져오기
from customer c, orders o
where c.custid = o.custid -- 가져오는 행들 중에서도 테이블의 custid 컬럼과 orders 의 custid가 일치하는 행들만 가져오기.
group by c.name -- 이걸 왜 하지?
order by c.name;

-- 3.25 고객의 이름(customer)과 고객의 주문한 도서(ordrs)의 구하시오. ==> 이름과 도서 이름정보를 검색하는것임.
-- 테이블이 어떤 컬럼으로, 왜 있는지 분석해야만 쿼리 작성 가능.!!
select c.name, b.bookname
from customer c, orders o, book b -- 테이블 별칭 지정
where c.custid = orders.custid and o.bookid = b.bookid; -- ??

-- 3.26 가격이 이만원인 도서를 주문한 고객 이름과 도서 이름 구하기.
-- 가격은 (book/orders) , 고객이름 (customer) , 도서 이름 (book) 에 있음.
-- 필요한 정보는 고객이름, 도서이름, 도서 가격
-- order
select * from orders;
select c.name, b.bookname, b.price
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid and b.price >= 20000;
-- 고객 테이블의 고객아이디와 주문 테이블의 고객아이디가 일치하는것 -> 주문한 고객 행들 뽑는 것.
-- 주문 테이블의 도서아이디와 북 아이디가 일치하는 것들 -> 주문된 도서들 (북 아이디가 일치하는건 왜?)
-- 도서 테이블의 가격 컬럼 중 이만원 이상인것들 뽑기.

-- 3.27 도서 구매하지 않은 고객 포함하여 고객의 이름과, 고객의 주문한 도서의 판매가격 구하기.
-- > orders, customer
select c.name, o.saleprice
from customer c left outer join orders o
on c.custid = o.custid;

select * from customer; -- custid, name, address, phone
-- customer 객체 자신이 가질 수 있는 필드(데이터) 값들 - customer id, customer's name, customer address, phone number
select * from orders; -- orderid, custid, bookid, saleprice, orderdate
-- 주문 객체 한개가 가질 수 있는 데이터들, 주문아이디, 주문한고객아이디, 주문한도서아이디, 주문한도서가격, 주문된날짜
select * from book; -- bookid, bookname, publisher, price
-- 도서 객체 한개가 가질 수 있는 데이터들 - 도서아이디, 도서이름, 도서출판사, 도서가격

-- -- -- -- -- -- Sub Query
use madangdb;
describe book;

-- 3.28 가장 비싼 도서의 이름을 검색하기. -- 서브쿼리 / nested query
select max(price) from book;
select bookname from book where price = 35000;
-- 두 개의의 쿼리를 하나의 쿼리로 만들기 위해 서브 쿼리 사용.
select bookname
from book
where price = (select max(price) from book);
-- where 절에 뭐리의 결과 넣는 것이 서브쿼리.

-- 도서를 구매한 적이 있는 고객 검색하기.
select custid from orders; -- 구매한적있는 고객 아이디 (결과: 1,2,3,4 )
select name from customer where custid in (1,2,3,4);
-- 서브쿼리로 다시 표현하기.
select name
from customer
where custid in(select custid from orders);

-- 3.3구매한 고객의 이름 검색하기. -- 무슨 컬럼이 어디 테이블에 있는지 알기.
-- 테이블의 구조를 알고 있어야함!
select distinct publisher from book;

select bookid from book where publisher = "대한미디어";

-- with subquery
select name
from customer
where custid in(select custid from orders where bookid IN(select bookid from book where publisher = "대한미디어"));

SELECT MAX(price) from book;
select bookname from book where price = 35000;
-- 두 개의 질의를 하나의 질의로 만들 수는 없을까 ?  subquery(부속질의 = 중첩질의 (nested query) 로 해결가능하다.
select bookname
from book
where price =(SELECT MAX(price) from book);
-- subquery 결과는 테이블로 반환됨

-- 단일행 - 단일열(1x1)  연산자 =
-- 다중행 - 단일열(nx1)  연산자 in 도서를 구매한 적이 있는 고객의 이름을 출력하세요
-- 단일행 - 다중열(1xn)
-- 다중행- 다중열(nxn)

-- 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오.
select * from book where publisher = '굿스포츠'; -- publisher가 굿스포츠인것들
select publisher, avg(price) from book group by publisher; -- 출판사별 평균 도서 가격 구하기
select * from book where price >= 7000; -- 평균 가격보다 비싼 도서 구하기

-- 다른 방식으로 다시.
select b1.bookname
from book b1 -- 튜플 변수
where b1.price >= (
		select avg(b2.price)
        from book b2
        where b2.publisher = b1.publisher -- 이걸 왜 비교하는거지?
        );
