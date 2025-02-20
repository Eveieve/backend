-- 1. HR 부서의 어떤 사원은 급여정보를 조회하는 업무를 맡고 있다. Tucker 사원보다 급여 를 많이 받고 있는 사원의 성과 이름(Name으로 별칭), 업무, 급여를 출력하시오
use hr;
show tables;
describe employees;

-- step 1
select last_name, salary
from employees
where last_name = "Tucker";
-- step 2
select last_name, job_id, salary
from employees
where salary > 10000;

-- using subquery
-- 다른 테이블을 써야하는 건 아니다 --
select e1.last_name, e1.salary
from employees e1
where e1.salary > ( -- 터버의 월급보다 많은 사람을 검색한다.
		select salary -- 먼저 터커라는 사람의 월급을 검색한다.
        from employees e2
        where e2.last_name = "Tucker"
        );



-- 2. 사원의 급여 정보 중 업무별 최소 급여를 받는 사원의 성과 이름(Name으로 별칭), 업무,급여, 입사일을 출력하시오
-- 업무별 중 최소 급여 받는 사원 출력하기
-- 업무별 최소란 말은 ? -- 같은 업무중 최소.
select * from employees;

-- 2. 업무별, 최소 급여를 받는 사원. 같은 업무를 하는 사원 중에서도 최소 급여를 받는 사원.
--
select job_id
from employees
group by job_id
having min(salary);

-- > fixed version:
-- 이렇게 하면 group by 에 포함되지 않은 컬럼도 검색할 수 있다. 함수를 select 절에 쓰기.
select job_id, min(salary) as min_salary
from employees
group by job_id;

-- select last_name, job_id, salary, hire_date
-- from employees
-- where salary  = (
--


-- 3. 소속 부서의 평균 급여보다 많은 급여를 받는 사원의 성과 이름(Name으로 별칭), 급여,부서번호, 업무를 출력하시오

-- step 1 - 소속 부서의 평균 구하기.
select avg(salary)
from employees
group by department_id;

-- step 2 - 소속 부서 평균 보다 많이 받는 사원들 정보 출력하기.
select last_name, salary, department_id, job_id
from employees
where salary IN (
	select avg(salary)
	from employees
	group by department_id
);

-- 3. 사원들의 지역별 근무 현황을 조회하고자 한다. 도시 이름이 영문 ‘O’로 시작하는 지역에 살고 있는 사원의 사번, 성과 이름(Name으로 별칭), 업무, 입사일을 출력하시오

-- step 1. -- 도시 이름이 영문 오로 시작하는 지역에 살고있는 사원
-- select employee_id, last_name, job_id, hire_date
-- from employees
-- where 도시 이름이 영문 오로 시작하는 지역에 살고 있음.
-- > 도시 이름이 영문 오로 시작하는 지역들을 먼저 찾아보기.
select city
from locations
where city like('o%'); -- 결과값 1개 레코드 반환함.

-- my answer:
select employee_id, last_name, job_id, hire_date, locations.city -- 도시는 그냥 출력해봄.
from employees, departments, locations
where employees.department_id = departments.department_id
and departments.location_id = locations.location_id
and locations.city in ( -- employees 테이블에는 city 가 없음.
		select city
		from locations
		where city like('o%')
);

-- 4. 시애틀에 사는 사람 중 커미션을 버는 모든 사람들의 LAST_NAME, 부서 명, 지역 ID 및 도시 명을 조회한다. -- ?????????

-- step 1. people who are living in seattle -- ?? correct??
select e.last_name, l.city
from employees e, locations l
where l.city = "Seattle"
and e.commission_pct is not null;

-- my aswner:
select e.last_name, d.department_id, l.location_id, city -- city 컬럼을 유일하게 locations 테이블에 존재하기 때문에 l.city 명시하지 않아도 됨.
from employees e, departments d, locations l
where e.department_id = d.department_id
and d.location_id = l.location_id
and l.city = 'Seattle'
and e.commission_pct is not null; -- ??????


select e.last_name, d.department_id, l.location_id, city -- city 컬럼을 유일하게 locations 테이블에 존재하기 때문에 l.city 명시하지 않아도 됨.
from employees e, departments d, locations l
where e.department_id = d.department_id
and d.location_id = l.location_id
and l.city = 'Seattle'
and e.commission_pct is not null; -- ??????

-- 4번이 서브쿼리가 필요한가?

-- Fixed version: ANSI version
select e.last_name, d.department_name, l.location_id, l.city
from employees e
join departments d on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
where l.city = 'Seattle'
and e.commission_pct is not null;

-- version 2
select e.last_name, d.department_name, l.location_id, l.city
from employees e
join departments d on e.department_id = d.department_id
join locations l on d.location_id = l.location_id
where l.location_id = (
	select city from locations where city = "Seattle"
)
and e.commission_pct is not null;


-- 5. LAST_NAME 이 DAVIES 인 사람보다 후에 고용된 사원들의 LAST_NAME 및 HIRE_DATE 을 조회한다.
select hire_date -- 값이 한개 -- 1997/01/29
from employees
where last_name = "Davies";

select last_name, hire_date
from employees
where hire_date > (
		select hire_date -- 값이 한개 -- 1997/01/29
		from employees
		where last_name = "Davies"
);


-- 6. 매니저로 근무하는 사원들의 총 수를 조회한다.
select * from employees;
-- manager_id 에 해당하는 employee_id 를 가진 사람들을 뽑기? 셀프조인인가?alter
-- my answer: WRONG
select count(e1.employee_id) -- 사원 수 세기
from employees e1, employees e2
where e1.employee_id = e2.manager_id; --

-- Fixed version:
select count(distinct e1.employee_id) as manager_count -- 한명의 매니저가 여러직원의 상사일 수 있기 때문에 distinct 해주기.
from employees e1
join employees e2 on e1.employee_id = e2.manager_id;

-- Subquery version:
-- 매니저로 근무하는 사람들
select distinct manager_id
from employees
where manager_id is not null; -- 만약 이 아이디들 중에서 사원과 일치하는 아이디가 있다면 그 사원들이 매니저들임.

-- subquery version my answer:
select count(distinct employee_id)
from employees
where employee_id in (
		select distinct manager_id -- 매니저 역할을 하고 있는 아이디만 출력.
		from employees
		where manager_id is not null -- 만약 이 아이디들 중에서 사원과 일치하는 아이디가 있다면 그 사원들이 매니저들임.
);

-- 7. LAST_NAME 이 Zlotkey 와 동일한 부서에 근무하는 모든 사원들의 사번 및 고용날짜를 조회한다.
select department_id
from employees
where last_name = "Zlotkey";

select employee_id, hire_date
from employees
where department_id = (
	select department_id
	from employees
	where last_name = "Zlotkey"
);
