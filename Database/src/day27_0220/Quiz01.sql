
use hr;
show full tables;
show tables;
select * from countries;
select * from departments;
-- 1. 연봉이 12000 이상되는 직원들의 LAST_NAME 및 연봉을 조회한다.
select * from employees;

select last_name, salary
from employees
where salary > 12000;

-- 2. 사원번호가 176 인 사람의 LAST_NAME 과 부서 번호를 조회한다.
select last_name, department_id
from employees
where employee_id like(176); -- like("176") is good too.

-- 3. 연봉이 5000 에서 12000의 범위 이외인 사람들의 LAST_NAME 및 연봉을 조회힌다.


-- 4. 1998/02/20 일부터 1998/05/01 사이에 고용된 사원들의 LAST_NAME 사번, 고용일자를 조회한다.  단, 고용일자 순으로 정렬한다.


-- 5. 20 번 및 50 번 부서에서 근무하는 모든 사원들의 LAST_NAME 및 부서 번호를 알파벳순으로 조회한다.


-- 6. 20 번 및 50 번 부서에 근무하며, 연봉이 5000 ~ 12,000 사이인 사원들의 LAST_NAME 및 연봉을 조회한다.


-- 7. 1994년도에 고용된 모든 사람들의 LAST_NAME 및 고용일을 조회한다.


-- 8. 매니저가 없는 사람들의 LAST_NAME 및 JOB_ID 를 조회한다.


-- 9. 매니저가 있는 사람들의 LAST_NAME 및 JOB_ID 를 조회한다.


-- 10. 커미션을 버는 모든 사원들의 LAST_ANME, 연봉 및 커미션을 조회한다.   연봉 역순, 커미션 역순차로 정렬한다.


-- 11. LAST_NAME 의 네번째 글자가 a 인 사원들의 LAST_NAME 을 조회한다.


-- 12. LAST_NAME 에 a 및(OR) e 글자가 있는 사원들의 LAST_NAME 을 조회한다.


-- 13. 연봉이 2,500, 3,500, 7000 이 아니며 직업이 SA_REP 이나 ST_CLERK 인 사람들을 조회한다.


-- 14. 모든 사원들의 LAST_NAME, 부서 이름 및 부서 번호을 조회한다.


-- 15. 부서번호 30 내의 모든 직업들을 조회한다. 90 부서 또한 포함한다.


-- 16. 커미션을 버는 모든 사람들의 LAST_NAME, 부서 명, 지역 ID 및 도시 명을 조회한다.
--
-- commission_pct 데이터를 가지고 있는 사람들. employees table
-- 지역아이디, 도시명은 locations table.
-- departments table has both location_id and department_id
-- employees t does not have location_id
-- departments t has location_id
-- commission is not null 인 사원의 location_id
select * from locations;
select * from employees;
select * from departments;

-- .??????????
select e.last_name, d.department_name, l.location_id, l.city  -- d.location_id 해도 같은지?
-- 부서명은 departments에, 도시명은 locations 에 있음.
from employees e, locations l, departments d
where e.commission_pct is not null -- 만족해야 하는 기본 조건 - 바탕으로 행이 필터링 됨

-- 여기서 필터링된 employee 레코드 중에서, employee의 department_id가 d.department_id 통해서 department_name 가져오기 위함.
and e.department_id = d.department_id -- employees table does not have department name - only department_id.
-- with department_id, i can retrieve department_name from departments table (d.department_name

-- 여기서 필터링 된 레코드들의 city 이름을 가져와야함. city 이름은 location테이블에 있음. 겹치는 부분이 있는건 departments 테이블의 location_id 와 locations 테이블의 location_id.
and d.location_id = l.location_id;
-


-- 17.  hr 스키마에 존재하는 Employees, Departments, Locations 테이블의 구조를 파악한 후 Oxford에 근무하는 사원의 성과 이름(Name으로 별칭), 업무, 부서명, 도시명을 출력하시오. 이때 첫 번째 열은 회사명인 ‘신세계’라는 상수 값이 출력되도록 하시오
select concat(e.first_name, " ", e.last_name) as Name, job_id, d.department_name, l.city
from employees e, departments d, locations l
where l.city like("Oxford") -- 바로 도시명에 해당하는 레코드 가져올 수 있군!
and e.department_id = d.department_id -- 행을 골라올때 e.department_id 와 d.deaprtment_id 가 연결되어서 사원의 department_name 을 가져올 수 있는 것임.
and d.location_id = l.location_id;



-- 18.  hr 스키마에 있는 Employees, Departments 테이블의 구조를 파악한 후 사원 수가 다섯명 이상인 부서의 부서명과 사원 수를 출력하시오. 이때 사원 수가 많은 순으로 정렬하시오
select * from employees;
select d.department_name, count(e.employee_id) -- employee_id is primary.
from departments d, employees e
group by d.department_name
having count(e.employee_id) >= 5; -- ???/


-- 19.  hr 스키마의 Job_Grades 테이블을 사용하여 각 사원의 급여에 따른 급여 등급을 보고하려고 한다. 급여 등급은 Job_Grades 테이블에 표시된다. 해당 테이블의 구조를 살펴본 후 사원의 성과 이름(Name으로 별칭), 업무, 부서명, 입사일, 급여, 급여 등급을 출력하시오

-- 20. 각 사원과 직속 상사와의 관계를 이용하여 다음과 같은 형식의 보고서를 작성하고자 한다.예) 홍길동은 허균에게 보고한다 → Neena Kochhar report to STEVEN KING 어떤 사원이 어떤 사원에게 보고하는지 위 예를 참고하여 출력하시오. 단, 보고할 상사가 없는 사원이 있다면 그 정보도 포함하여 출력하고, 상사의 이름은 대문자로 출력하시오

--
-- SELF JOIN
-- 직원들의 직속상사의 정보를 출력하기.
select staff.last_name, staff.job_id, manager.last_name, manager.job_id
from employees staff, employees manager
where staff.manager_id = manager.employee_id;
