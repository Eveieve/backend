-- 저장 프로시저 SP_MEMBER_INSERT
use ssg;
drop procedure SP_MEMBER_INSERT;
create table tb_member
(
    m_sq         int auto_increment primary key,
    m_userid     varchar(20) not null,
    m_pwd        varchar(20) not null,
    m_email      varchar(50) not null,
    m_hp         varchar(20) null,
    m_registdate datetime default now(),
    m_point      int      default 0
);


insert into tb_member (m_userid, m_pwd, m_email, m_hp)
values ('apple', '1234', 'apple@gmail.com', '0102910');


DELIMITER $$
DROP PROCEDURE IF EXISTS SP_MEMBER_INSERT $$
CREATE PROCEDURE SP_MEMBER_INSERT(
    IN V_USERID VARCHAR(50),
    IN V_PWD VARCHAR(50),
    IN V_EMAIL VARCHAR(50),
    IN V_HP VARCHAR(20),
    OUT RTN_CODE INT
)

BEGIN
    DECLARE v_count int;

    -- 중복사용자 예외 처리
    SELECT COUNT(m_sq) into v_count FROM TB_MEMBER WHERE m_userid = V_USERID;

    IF v_count > 0 then
        SET RTN_CODE = 100; -- 이미 존재하는 사용자 있다.
    ELSE
        INSERT INTO TB_MEMBER (M_USERID, M_PWD, M_EMAIL, M_HP) VALUES (V_USERID, V_PWD, V_EMAIL, V_HP);

        SET RTN_CODE = 200;

    END IF;
    COMMIT;

end $$
DELIMITER ;


-- MYSQL 프로시저를 통해 INSERT 실행
SET @RTN_CODE = 0;
CALL SP_MEMBER_INSERT('winter','1234','winter@gmail.com','010-8989-9333' ,@RTN_CODE);
SELECT @RTN_CODE;