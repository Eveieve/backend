use ssg;

create table if not exists testTBl
(
    id  int,
    txt varchar(20)
);

insert into testTBL
values (1, 'redvelvet'),
       (2, 'itsy'),
       (3, 'blackpink');

-- trigger 작성해보기.
delimiter //
create trigger testTrg
    after delete --  starts after 'trigger'
    on testTBl
    for each row -- 삭제되는 각 행마다 실행.
begin
    set @msg = 'group is deleted'; -- 세션변수는, db에 저장되지 않고 메모리에서만 유지.
end //
delimiter ;

-- 작성한 트리거 실험해보기.
set @msg = '';
insert into testTBl
values (4, 'mamamoo');
select @msg;

set @msg = '';
delete
from testTBl
where id = 4;
select @msg;

-- 기본 문법
# create
# [definer = user]
# trigger trigger_name
# trigger_time trigger_event
# on tbl_name for each row
# [trigger_order]
# trigger_body
#
# trigger_time : before, after
# trigger_event : insert, update, delete
# trigger_order : follows, precedes other_trigger_name

-- 변경 된기 전 데이터를 저장하는 테이블.

drop table backup_userTBL;
create table backup_userTBL
(
    userID    char(8) primary key,
    name      varchar(10) not null,
    birthYear int         not null,
    addr      char(2)     not null,
    mobile1   char(3),
    mobile2   char(8),
    height    smallint,
    mDate     DATE,
    modType   char(10),
    moDate    date,
    modUser   varchar(256)

);

-- table to store data after trigger
drop trigger backup_userTBL;

delimiter //
create trigger backup_userTBL
    after delete
    on usertbl
    for each row
begin
    insert into backup_userTBL
    values (OLD.userID, OLD.name, OLD.birthYear,
            OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate,
            'modified', curdate(), current_user());
end //
delimiter ;

select *
from userTBL;


update userTBL
set addr = '몽고'
where userID = 'JKW';

delete
from userTBL
where height >= 177;
-- 외래키 제약조건때문에 삭제 되지 않음! Cannot delete or update a parent row: a foriegn key constraint fails REFERENCES usertbl
# userTBL: 부모 테이블 (Primary Key 보유)
# buyTBL: 자식 테이블 (Foreign Key로 부모 테이블의 userID 참조)

delete
from buyTBL
where userID = 'JYP';

delete
from userTBL
where userID = 'JYP';

select *
from userTBL;

select *
from backup_userTBL;
