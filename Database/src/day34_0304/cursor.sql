# 커서
테이블에서 여러 개의 행을 쿼리한 후, 쿼리의 결과인 행 집합을 한 행씩 읽어드려 처리하기 위한 것이다.
스토어드 프로시저 내부에 사용되고 , 일반 프로그래밍 언어 파일 처리와 방법이 비슷한다. 행의 집합을 다루기 편리한 기능을 제공한다.

# 커서의 작동 순서

# 1. 커서를 선언.
# 2. 핸들러 선언 - 결과 집합의 끝에 도달했을때 루프를 종료하기 위한 핸들러 선언.
# 3. 커서 열기 - 커서 사용하기 전에 반드시 열어야 함.
# 3. 커서에서 한행씩 데이터를 가져오기 - FETCH 커서이름 INTO 변수1, 변수2...
# 4. 커서를 반복해서 읽으며 원하는 작업을 수행하기
# 5. 커서 닫기.


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
        select height from usertbl; -- 특정 테이블에서 특정 컬럼 가져오기.

    declare continue handler -- continue handler 선언하기
        for not found set endOfrow = true; -- 행의 끝이면 endOrRow 변수에 true 를 대입하기.

    open userCursor; -- 커서 열기.

    cursor_loop: -- 루프 시작.
    LOOP
        fetch userCursor into userHeight; -- userHEight 컬럼에 useCursor 의 행 한개를 대입
        if endOfRow then -- 마지막 행에 도달했으면
            leave cursor_loop; -- 루프를 빠져나오기
        end if; -- if 문을 끝내기.
        set cnt = cnt + 1; -- 행 1개에 대한 작업 완료했으니 1만틈 횟수를 올려주기.
        set totalHeight = totalHeight + userHeight; -- 총 키에 한개 컬럼의 키를 더하기
    end loop cursor_loop; -- 시작한 루프문을 끝내기
    -- 출력하기
    select concat('average height of customers: ', (totalHeight / cnt));
    close userCursor; -- 커서 사용이 씉났으면 항상 닫아주기.
end $$
delimiter ;

call cursorProc(); --  프로시저 호출하기
-- average height of customers: 178.1429 출력됨.