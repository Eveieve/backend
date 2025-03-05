use ssg;

drop table if exists tb_product;

create table tb_product
(
    prodCode  char(3)  not null,
    prodId    char(4)  not null,
    prodDate  datetime not null,
    prodState char(10) null

);

alter table tb_product
    add constraint PK_product_proCode_proID -- 이름을 이렇게 정해줘야 나중에 찾기 수월
        primary key (prodCode, prodId);

-- tb_product 테이블에 어떤 인덱스들이 설정되어 있는지, 그 인덱스들이 어떤 컬럼을 기준으로 만들어졌는지, 인덱스가 유니크한지 아닌지 등을 확인할 수 있다.
show index from tb_product;

-- 뷰: 일반 사용자에게 테이블과 동일. 한번 생성해놓으면 사용가능한 객체이다.
select *
from usertbl; -- table 형태이다.
select userid, name, addr
from usertbl;
-- 필요한 컬럼들만 보기.
-- 그럼 필요한 부분들만 뷰로 만들 수 있다!
create view v_usertbl as
select userid, name, addr
from usertbl; -- 사용자의 중요한 개읹정보는 포함하지 않는 뷰 테이블.
select *
from v_usertbl;
-- 읽기 전용 테이블이다. 수정 가능하지만 권장되지 않는다.

-- 뷰를 사용하는 이유?
# 여러 테이블을 조인하거나 복잡한 계산을 포함하는 쿼리를 뷰로 정의해두면, 사용자는 그 뷰를 조회하는 것만으로 복잡한 로직을 간단히 사용할 수 있다.
# 예: 복잡한 조인, 서브쿼리 등을 반복적으로 사용하지 않고 뷰로 대체.

# 뷰를 사용하여 사용자가 민감한 데이터를 직접 조회하지 못하게 제한할 수 있다. 예를 들어, 특정 컬럼(개인 정보나 비밀번호 등)을 뷰에서 제외하고 공개용 정보를 제공하는 방식으로 보안을 강화할 수 있다.
# 예: SELECT * FROM employees_view는 직원 이름과 부서만 제공하고, 급여나 비밀번호 정보는 제외될 수 있다.
# 3. 재사용성
# 동일한 쿼리를 여러 번 작성할 필요 없이, 한 번 정의한 뷰를 여러 곳에서 재사용할 수 있다.
# 예: 매일 같은 방식으로 분석되는 데이터가 있을 때, 이를 뷰로 정의하고 반복적인 쿼리를 대신할 수 있다.
# 4. 데이터 무결성 유지
# 뷰를 사용하면 비즈니스 로직이나 계산을 데이터베이스 내에서 처리할 수 있어, 애플리케이션에서 일관성 있는 데이터를 쉽게 반환할 수 있다.
# 예: 총 판매액을 계산한 뷰를 사용하여 항상 일관된 결과를 제공.
# 5. 추상화
# 데이터베이스의 실제 테이블 구조를 숨기고, 더 직관적이고 사용하기 쉬운 구조를 사용자에게 제공할 수 있다.
# 예: 복잡한 테이블 구조를 묶어서 사용자에게 필요한 형태로 추상화된 데이터를 제공.
# 6. 성능 최적화
# 자주 실행되는 복잡한 쿼리를 뷰로 정의해두면, 해당 쿼리를 반복 실행할 때 성능을 최적화할 수 있는 경우가 있다. 그러나 이는 뷰의 정의에 따라 다를 수 있으며, 적절히 인덱스나 캐시를 사용하는 것이 중요하다.

create view v_userbuytbl as
select u.userid, u.name, u.addr
from usertbl u
         inner join buytbl b on u.userID = b.userID;

select *
from v_userbuytbl
where name = '바비킴';

drop view v_userbuytbl; -- 원본 테이블에 영향없이 삭제하면 됨.