Aggregate function : 테이블의 각 열에 대해 계산하는 함수.


desc employees;

-- 1.  사원정보(Employees)테이블에서 사원번호, 이름 , 급여, 업무 , 입사일, 상사의 사원번호를 출력하시오. 이때 이름은 성과 이름을 연결하여 Name이라는 별칭으로 출력하세요
SELECT employee_id, CONCAT(first_name, ' ', last_name) as 'Name', salary, hire_date, manager_id FROM employees;

-- 2.  사원 정보(Employees) 테이블에서 사원의 성과 이름은 Name, 업무는 Job, 급여는 Salary, 연봉에 $100 보너스를 추가하여 계산한 값은 Increased Ann_Salary, 급여에 $100 너스를 추가하여 계산한 연봉은 “Increased Salary”라는 별칭으로 출력하시오
SELECT CONCAT(first_name, ' ', last_name) as 'Name', job_id as Job , salary as Salary, salary*12 + 100 as 'Increased Ann_Salary', (salary + 100)*12 as 'Increased Salary' FROM Employees;

-- 3.  사원 정보(Employees) 테이블에서 모든 사원의 이름(last_name)과 연봉을 “이름: 1 Year Salary = $연봉” 형식으로 출력하고, 1 Year Salary라는 별칭을 붙여 출력하시오
SELECT CONCAT(last_name, ' : 1 Year Salary = $', salary*12) as '1 Year Salary' FROM employees;

-- 4.  부서별로 담당하는 업무를 한 번씩만 출력하시오
SELECT DISTINCT department_id, job_id FROM employees;

-- 5.  HR 부서에서 예산 편성 문제로 급여 정보 보고서를 작성하려고 한다. 사원 정보 (Employees) 테이블에서 급여가 $7,000 ~$10,000 범위 이외인 사람의 성과 이름(Name으로 별칭) 및 급여를 급여가 작은 순서로 출력하시오
SELECT concat(First_name, ' ', last_name) as 'Name'
FROM employees
WHERE salary NOT BETWEEN 7000 AND 10000 ORDER BY salary; -- default is asc.

-- 6. 사원의 성(last_name) 중에 ‘e’ 및 ‘o’ 글자가 포함된 사원을 출력하시오. 이때 머리글은 ‘e AND o Name’이라고 출력하시오
SELECT last_name as 'e AND o Name'
FROM employees -- WHERE 절보다 FROM 먼저
WHERE last_name like '%e%' AND last_name LIKE '%o%'; -- OR 은 둘 중에 하나만

-- 7. 현재 날짜 타입을 날짜 함수를 통해 확인하고, 1995년 5월 20일부터 1996년 5월 20일 사이에 고용된 사원들의 성과 이름(Name으로 별칭), 사원 번호, 고용 일자를 출력하시오. 단, 입사일이 빠른 순으로 정렬하시오
SELECT SYSDATE() FROM DUAL; -- DUAL 이라는 더미 테이블 , 문법 맞추기 위해 그냥 넣음. 2025-02-19 11:38:49 형태.
SELECT NOW() FROM DUAL; -- sysdate()와 같음.

SELECT last_name as 'Name', employee_id, hire_date
FROM employees
WHERE hire_date between str_to_date('1995/05/20', '%Y/%m/%d') and str_to_date('1996/05/20', '%Y/%m/%d')-- BETWEEN 은 문자열을 받기 때문에 str_to_date 하여 문자열로 바꿔줌
ORDER BY hire_date;

-- 8. HR 부서에서는 급여(salary)와 수당율(commission_pct)에 대한 지출 보고서를 작성하려고 한다. 수당을 받는 모든 사원의 성과 이름(Name으로 별칭), 급여, 업무, 수당율을 출력하시오. 이때 급여가 큰 순서대로 정렬하되, 급여가 같으면 수당율이 큰 순서대로 정렬하시오
desc employees;
SELECT concat(first_name, ' ', last_name) as 'Name', salary, job_id, commission_pct
FROM employees
WHERE commission_pct is not null -- not null 인 사원들만 검색.
ORDER BY salary desc, commission_pct desc;


-----------------------------
-- 고객별로 주문한 도서의 총 수량과 총 판매액
SELECT custid as '고객아이디', count(bookid) as 도서수량, sum(saleprice) as 총액
FROM Orders
GROUP BY custid;

desc Orders;
SELECT * FROM Orders;

-- 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총 수량 구하기. 단, 두 권이상 구매한 고객만 구하기.
SELECT custid as 고객아이디, count(bookid) as 도서수량
FROM Orders
WHERE saleprice >= 80002
GROUP BY custid
HAVING count(bookid) >=2;

select custid, sum(saleprice)
from orders
group by custid;

---------------------------------------------------------------------
-- 도서번호가 1인 도서의 이름
desc Book;
SELECT bookname
FROM Book
WHERE bookid = 1;
-- 가격이 2000원 이상인 도서 이름
desc Book;
SELECT bookname
FROM Book
where price >= 2000;
-- 박지성의 총 구매액
desc Customer;
select * from book;
select * from orders;
SELECT * from customer;
select sum(saleprice)
from orders
where custid = 1;
-- 고객넘버1이 구매한 도서 수
select * from orders;
select count(bookid) as '구매도서' -- why bookid?
from orders
where custid = 1;
-- 도서 총 개수
select * from book;
select count(bookid) as 도서총개수 -- bookid 하나당 책한개
from book;
-- 도서 출고하는 출판사 총 개수
select * from book;
select count(publisher) as 출판사총개수
from book;
-- 모든 고객 이름, 주소
select * from customer;
select address, name from customer;
-- 2.4
select * from orders;
select orderid
from orders
where orderdate between '2014-07-04' and '2024-07-04';
-- 2.5
select orderid, orderdate
from orders
where orderdate not between '2014-07-04' and '2024-07-04';
-- 2.6
select name, address
from customer
where name like '김%';
-- 2.7
select * from customer;
select name, address
from customer
where name like '김%' AND name like '%아';


select count(employee_id) as 사원총수
from employees
where manager_id IS NOT NULL;

-- 2. 각 사원이 소속된 부서별로 급여 합계, 급여 평균, 급여 최댓값, 급여 최솟값을 집계하고자 한다. 부서번호의 오름차순 정렬하기, 부서에 소속되지 않은 사원에 대한 정보는 제외.
--
select * from employees;

select department_id, sum(salary) as 급여합계, avg(salary) as 급여평균, min(salary) as 급여최솟값, max(salary) as 급여최댓값
from employees
group by department_id
having department_id is not null
order by department_id; -- default is order by asc.

-- 3. 업무별 전체 급여 평균이 > 10000보다 큰 경우 조회하여, 업무, 급여 평균 출력하시오.
-- 업무에 사원이 포함된 경우 제외 . 전체 급여 평균이 높은 순서대로.
select * from employees;

select job_id, avg(salary) as 'avg total salary'
from employees
group by job_id -- 업무별로 그룹화.. 그룹화 한다는게 뭔지
having avg(salary) > 10000
and job_id not like '%CLERK%'
order by job_id desc;
