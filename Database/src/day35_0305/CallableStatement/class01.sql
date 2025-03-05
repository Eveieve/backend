-- callableStatement

-- create sample table, without primary keys

drop table code1;
drop procedure p_insertcodes;


CREATE TABLE CODE1(cId int, cName VARCHAR(20));
select * from code1;
INSERT INTO CODE1 VALUES (1, '프론트 디자이너');

-- 이게 뭐하는건지 다시 파악하기!
DELIMITER $$
CREATE PROCEDURE p_insertcodes(in cData varchar(255),in cTName varchar(255), out resultMsg varchar(255))
BEGIN
    -- 쿼리문 생성 - 여기서 생성이유?
    -- 문자열을 조합하여 나중에 실행할 쿼리문 생성
    SET @strsql = CONCAT(
            'INSERT INTO ', cTName, ' (cId , cName) ', ' SELECT COALESCE(MAX(cId),0) + 1  , ? FROM ' , cTname );

    -- 바인딩할 변수 설정
    SET @cData = cData;
    SET resultMsg = 'Insert Successful';

    PREPARE stmt FROM @strsql;

    EXECUTE stmt using @cData;
    execute stmt using @resultMsg; -- stmt 에 reulstMsg 담기
    deallocate prepare stmt;

    -- 트랜젝션 확정
    COMMIT;

END $$
DELIMITER ;

-- CALL p_insertcodes('백엔드 자바 개발자','CODE1');
select * from code1;