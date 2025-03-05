drop procedure SP_MEMBER_LIST;
delimiter $$
create procedure SP_MEMBER_LIST()
begin
    set @sqlstr = concat('SELECT * FROM TB_MEMBER'); -- 실행할 쿼리문을 동적으로 저장한다.

    -- 동적 sql 실행위한 준비문. prepare statement 생성하는 과정.
    -- 동적 sql은 쿼리문을 문자열 변수에 담아 실행하는 방식이다.
    -- 테이블명, 컬럼명 조건 등을 런타임에 결정할때 사용한다.
    prepare stmt from @sqlstr;
    execute stmt; -- 이 명령은 앞서 준비된 stmt를 실행한다. 즉, @sqlstr에 저장된 SQL 쿼리가 실행된다.
    deallocate prepare stmt;

    commit ;
end $$
delimiter ;

call SP_MEMBER_LIST();