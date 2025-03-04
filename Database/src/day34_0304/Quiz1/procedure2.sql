-- 1.3 usertbl 테이블 :  1980년 이후 출생자에게는 "고객님 건강보험 생애 전환 서비스 가입에 해당하지 않습니다." 1980년 이전 출생자들에게는 "고객님 건강보험 생애 전환 서비스 가입에 해당하오니 가입해 주시길 바랍니다." 출력하는 프로시저 작성
drop procedure if exists ifelseProc;

delimiter $$
begin
create procedure ifelseProc(in userName varchar(20))

-- 1.4 while문을 활용하여 구구단을 문자열로 생성해서 테이블에 입력하는 프로시저를 작성해 보자
    drop table if exists guguTBL;
create table guguTBL
(
    txt varchar(100)
);
-- 구구단 저장용 테이블.

-- 구구단을 프린트하는 프로시저
drop procedure if exists whileProcgugu;
delimiter $$

create procedure whileProcgugu()
begin
    declare i int; -- 단수
    declare j int; -- 곱해질 수
    declare str varchar(100);
    set i = 2;

    while(i < 10)
        do
            set str = '';
            while j <= 9
                do
                    select concat(i, ' * ', j, ' = ', i * j) as result;
                    set j = j + 1;
                end while;
            set i = i + 1;
        end while;
end $$

delimiter ;

call whileProcgugu();
select *
from guguTBL;

-- 퀴즈 : 1~ 100 합계
use ssg;

delimiter $$
create procedure total_sum(in start int, in end int)
begin
    declare i int;
    declare sum int;
    declare message varchar(100);
    declare savePointResult int;
    declare exit handler for 1264 --
        begin
            select concat('INT 오버플로 직전의 합계 --> ', savePointResult);
            select concat('1+2+3+ ... + ', i, ' = 오버플로');
        end;

    set i = start;
    set sum = 0;

    while(i <= end)
        do
            set sum = sum + i;
            set i = i + 1;
        end while;

    set message = concat(start, ' ~ ', end, '의 출력은 ', sum, ' 입니다');
    select message as result;
end $$
delimiter ;

drop procedure total_sum;
call total_sum(1, 100);

# 핸들러(Handler): 프로시저나 함수에서 예외 상황(오류) 발생 시 특정 작업을 수행하도록 미리 정의해두는 구문.
# 1264: MySQL 오류 코드 중 하나로, Out of range value for column (컬럼에 허용 범위를 초과한 값이 들어갔을 때 발생) 오류를 의미함
--
-- Information_schema  에서 원하는 데베 가져올 수 있음.


-- 결과물을 테이블로 만들어 그 테이블을 계속 쓸 수도 있음

-- 1.5 DECARE~ HANDLER 를 이용해서 오류처리 구문을 추가해 보자 . ex) 1부터 숫자를 더하여 합계가 정수형(int)데이터 형식의 오버플로우가 발생하면 멈추고 오류처리를 해보자

-- 1.6 현재 저장된 프로시저의 이름과 내용을 확인해 보자
use information_schema;


select routine_name, ROUTINES.ROUTINE_DEFINITION
from information_schema.routines
where routine_schema = 'ssg'
  AND routine_type = 'procedure';

-- 1.7 파라미터도 확인해 보자
select parameter_mode, parameter_name, DTD_IDENTIFIER
from information_schema.PARAMETERS
where specific_name = 'ifElseProc';

-- 1.8 테이블 이름을 파라미터로 전달해 보자


# delimiter $$
# create procedure nameTblProc(IN tblname varchar(20))
# begin
#     select * from tblname;
# end $$
# delimiter ;
#
# call nameTblProc(usertbl); -- 테이블을 매개변수로 사용할 수 없다. 동적 sql 활용해 처리해야함.

drop procedure if exists nameTblProc;
-- 다시 화인하기! 실행안됨.
use ssg;
delimiter $$
create procedure nameTblProc(IN tblname varchar(20))
begin
    set @sqlQuery = concat('select * from', tblname);
    prepare myQuery from @sqlQuery;
    execute myQuery;
    deallocate prepare myQuery;

end $$
delimiter ;

call nameTblProc('usertbl');
-- 1.9 배송담당자는 사용자의 정보를 접근할 수 있는 프로시저(delivProc)를 이용하여 사용자의 주소와 이름을 확인한다.

delimiter $$
create procedure delivProc(in userId varchar(10))
begin
    select usertbl, userID, usertbl.addr, usertbl.mobile1, usertbl.mobile2 from usertbl where userID = id;

end $$
delimiter ;
