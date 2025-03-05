use ssg;

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

select *
from tb_member;

drop procedure SP_MEMBER_INSERT;

delimiter $$
create procedure SP_MEMBER_INSERT(IN v_userid VARCHAR(255),
                                  IN v_pwd VARCHAR(255),
                                  IN v_email VARCHAR(255),
                                  IN v_hp VARCHAR(20),
                                  out rtn_code int)
begin
    declare cnt int;
    -- cnt variable

    -- 중복 사용자 예외 처리하기.
    select count(v_seq) into cnt from tb_member where m_userid = v_userid;

    if cnt > 0 then
        set rnt_code = 100;
    else
        insert into tb_member (m_sq, m_userid, m_pwd, m_email, m_hp)
        set rnt_code = 200;
    end if;
    commit;
    end $$
    delimiter ;

call SP_MEMBER_INSERT('winter', '1234', 'winter@ggmail.com', '010281928');

select *
from tb_member;

