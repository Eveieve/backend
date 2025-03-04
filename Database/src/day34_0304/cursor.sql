-- # 커서
# 테이블에서 여러 개의 행을 쿼리한 후, 쿼리의 결과인 행 집합을 한 행씩 읽어드려 처리하기 위한 것이다.
# 스토어드 프로시저 내부에 사용되고 , 일반 프로그래밍 언어 파일 처리와 방법이 비슷한다. 행의 집합을 다루기 편리한 기능을 제공한다.

## 커서의 작동 순서

# 1. 커서를 선언.
# 2. 반복 조건 선언 - 더이상 읽을 행이 없을 경우, 실행할 내용을 설정한다.
# 3. 커서를 열어야 한다.
# 4. 커서에서 데이터를 가져온다. -- 반복 구간안에서 실행됨.
# 5. 데이터 처리 -- 반복 구간안에서 실행됨.
# 6. 커서를 닫기.

## 커서 실습
use ssg;
drop procedure if exists cursorProc;

delimiter $$
create procedure cursorProc()
begin
    declare userHeight int; -- 고객의 키
    declare cnt INT default 0; -- 고객의 수. (=읽은 행의 수)
    declare totalHeight int default 0; -- 키의 합께 - 기본 0 부터 시작.

    declare endOfRow boolean default false;
    -- 행의 끝 여부

-- 프로시저 내부의 커서 선언 시작.
    declare userCursor CURSOR FOR -- 커서 선언 시작.
        select height from usertbl;

    declare continue handler
        for not found set endOfrow = true;

    open userCursor;

    cursor_loop:
    LOOP
        fetch userCursor into userHeight;

        if endOfRow then
            leave cursor_loop;
        end if;

        set cnt = cnt + 1;
        set totalHeight = totalHeight + userHeight;
    end loop cursor_loop;

    select concat('average height of customers: ', (totalHeight / cnt));

    close userCursor;
end $$

delimiter ;