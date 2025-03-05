-- 테이블 스페이스
# 테이블이 저장되는 물리적 공간이다.
# 대용량 데이터를 다룰때 성능 향상을 위해 테이블 스페이스를 사용한다.
# 데이터베이스는 테이블을 논리적 공간으로 다룬다. 실제 데이터가 저장되는 물리적 공간이다.

show variables like 'innodb_data_file_path';
-- 12 메가 까지 정할 수 있는 공간이다.
-- ibdata 라는 것, 12M, 12메가씩 autoextend 하여라. 하드디스크 여유가 있다면..

# 1. innodb_file_per_table 상태정보를 on으로 설정하기.
show variables like 'innodb_file_per_table'; -- on 상태이니 재설정할 수 있음.

# 테이블 스페이스 설정

create tablespace ts__a add datafile 'ts_a.ibd';
create tablespace ts__b add datafile 'ts_b.ibd';
create tablespace ts__c add datafile 'ts_c.ibd';

use ssg;
create table table_a (id int) tablespace ts__a; -- 아이디 커럼 하나인 테이블 생성. ts__a 테이블 스페이스에 저장하겠다.
alter table table_a tablespace ts__b; -- table_a 테이블을 ts__b라는 테이블스페이스로 이동시키겠다

use sakila;
create table table_c (select * from sakila.customer); -- sakila.customer 테이블의 모든 것을 table_c에 담는다

