Use ssg;

drop function if exists userFunc;

-- stored function 사용을 위해 함수 생성 권한을 허용한다.
set global log_bin_trust_function_creators  = 1;

-- 함수 선언
delimiter $$
create function userFunc(value1 int, value2 int)
    returns int
begin
return value1 + value2;
end $$
delimiter ;

-- 함수 실행/호출. select 사용한다.
select userFunc(15, 150); -- 함수 호출. select 로 호출한다.

-- practice01

drop function if exists getAgeFunc;

delimiter $$
create function getAgeFunc(bYear int)
returns int -- 반환할 자료형을 명시한다.
begin
    declare age int;
    set age = year(curdate())- bYear; -- curdate()
    return age;
end $$
delimiter ;

select getAgeFunc(1980);

-- 함수 반환값을 select...into 로 저장 후 사용 가능하다.
select getAgeFunc(1980) into @age1980; -- 변수 age1980에 결과값 저장.
select getAgeFunc(1998) into @age1998;
select concat('difference between 1980 and 1998 : ', (@age1980 - @age1998) ) as result;  -- result 라는 컬럼에 출력.

-- stored function 은 주로 테이블을 조회할때 사용된다.

-- [저장된 스토어드 함수 이름 및 내용 확인하는법]
-- 스토어드 함수 삭제하는법

