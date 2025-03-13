use 신세계무역;

select *
from 제품;

-- 17.
select *
from 제품
where 제품명 like ('%주스%');

-- 18.
select *
from 제품
where 단가 between 5000 and 10000;

-- 19. ?
select *
from 제품
where 제품번호 in (1, 2, 4, 7, 11, 20);

-- 20. 재고금액 높은 10개제품 ??
select *
from 제품
order by 재고 * 단가 desc
limit 10;
-- 10개만 검색한다.

-- 21. ?? 1번.
select char_length('데이터'), length('데이터');
-- char_length 는 문자개수 반환 = 3.
-- length 는 문자열의 바이트수 반환. 다국어문자는 1문자라도 여러 바이트로 저장.

-- 22. 4번 ??
select substring_index('165.134.87.132', '.', -2);
-- 87.132
-- substring_index 함수 - 문자열에서 지정된 구분자를 기준으로 부분 문자열 추출함.
-- substring_index(string, delimiter,count)
-- count 는 추출할 부분 문자열 개수. 양수면 구분자 기준 왼쪽에서부터 추출.
-- 음수이면 구분자 기준 2번째 문자열을 추출함.

-- 23. field(), find_in_set(), instr(), elt()
-- field(str, str1, str2, str3, ...): str 이 목록에서 몇번째 위치에 있는지 반환.
select field('apple', 'banana', 'apple', 'orange');
-- find_in_set(): 쉼표로 구분된 문자열 목록에서 특정 값이 몇번째 위치에 있는지 반환. 목록에 없으면 0 반환.
select find_in_set('apple', 'banana, apple, orange');
-- instr(str, substr) : 특정 문자열이 다른 문자열 내에서 처음으로 등장하는 위치를 반환.
select instr('apple', 'p');
-- elt(N, str1, str2, str3, ...): 숫자 인자에 따라 지정된 목록에서 해당 순서에 있는 값 반환. 숫자 인자는 1부터 시작.
select elt(2, 'apple', 'banana', 'orange');
-- 'banana'


-- 24. 현재시간에서 500 시간 후
select date_add(now(), interval 500 hour);

-- 25. 1
select ifnull(128 / 0, 'error'), nullif(1 + 2, 3), nullif(1 + 2, 5);


-- 26. case ~ when

-- 28.
select *
from 고객;
select 담당자명
from 고객
where 담당자명 like ('%정%');

-- 28.
select *
from 주문;
select *
from 주문
where 주문일 between '2020-04-01' and '2020-06-30';

-- 30.
select *
from 사원;
drop table 사원;


CREATE TABLE 사원
(
    사원번호 CHAR(3) PRIMARY KEY,
    이름   VARCHAR(20),
    영문이름 VARCHAR(20),
    직위   VARCHAR(10),
    성별   CHAR(2),
    생일   DATE,
    입사일  DATE,
    주소   VARCHAR(50),
    도시   VARCHAR(20),
    지역   VARCHAR(20),
    집전화  VARCHAR(20),
    상사번호 CHAR(3),
    부서번호 CHAR(2)
) DEFAULT CHARSET = utf8mb4;
use 신세계무역;
select *
from 사원
where 입사일 >= (DATE_SUB(curdate(), interval 40 month));

-- 31. 4

-- 32. 1

-- 33. ??

-- 34.
select 담당자직위, 도시, count(*) as 고객수
from 고객
group by 담당자직위, 도시
with rollup;

-- 35. 1
-- concat(), group_concat()

-- 36. ??
select 제품번호, count(주문수량)
from 주문세부
group by 제품번호;

select *
from 주문세부;

select sum(주문수량 * 단가) as 주문금액합
from 주문세부
group by 제품번호;

-- 37. 주문번호 별 주문된 제품번호 목록과 주문금액합 ??
SELECT 주문번호,
       GROUP_CONCAT(제품번호 ORDER BY 제품번호) AS 제품번호목록,
       SUM(주문수량 * 단가)                   AS 주문금액합
FROM 주문세부
GROUP BY 주문번호;

-- 38. ????
select *
from 주문;
select 고객번호, count(주문번호) as 주문건수
from 주문
where 주문일 between '2021-01-01' and '2021-12-31'
group by 고객번호
order by 주문건수 desc
limit 3;

-- 39. 직위별 사원수와 사원이름목록 ???
select *
from 사원;

select 직위, count(사원번호) as 사원수, group_concat(이름) as 이름목록
from 사원
group by 직위;

-- 40. 2

-- 41. 2

-- 42. 3

-- 43. 그림 5-3. 조인을 위해 몇개 테이블?
select *
from 고객;

-- 44 .

-- 45. 마일리지 등급명별 고객 수. 등급별로 고객수를 센다 ???
-- 고객 테이블에 등급명이 없음
-- 고객의 마일리지가 하한마일리지 이상 상하 마일리지 이하일때
# select 마.등급명, count(고.고객번호) as 고객수
# from 고객 고 -- 고객 테이블 기반으로
# join 마일리지등급 마
#     on 마.등급명 >= 마.하한마일리지 and 고.마일리지 <= 마.상한마일리지 -- 여기에
# group by 마.등급명;

-- 46. 주문번호 'H0249' 주문한 고객의 정보?
select *
from 고객,
     주문
where 고객.고객번호 = 주문.고객번호 -- inner join - ansi 문법으로도 써보기.
  and 주문.주문번호 = 'H0249';

-- 47.
select *
from 고객,
     주문
where 고객.고객번호 = 주문.고객번호
  and 주문.주문일 = '2020-04-09';

-- 48. 도시별 주문금액합, 주문금액합 상위 5개 보이기
select 도시, sum(단가 * 주문수량) as 주문금액합
from 고객,
     주문,
     주문세부 -- 세테이블에서 정보 가져오기
where 고객.고객번호 = 주문.고객번호
  and 주문.주문번호 = 주문세부.주문번호
group by 고객.도시;

-- ansi 방식
SELECT 고객.도시, SUM(단가 * 주문수량) AS 주문금액합
FROM 고객
         JOIN 주문 ON 고객.고객번호 = 주문.고객번호
         JOIN 주문세부 ON 주문.주문번호 = 주문세부.주문번호
GROUP BY 고객.도시;

-- 49. 오류가 발생하는 쿼리문? 1번. => 왜 인지 분석하기.
# select * from 고객 where 마일리지 = MIN(마일리지);

select 고객번호,
       담당자명,
       (select count(*) as 주문건수
        from 주문
        where 주문.고객번호 = 고객.고객번호 -- 주문한 고객들만 가져와짐
       ) as 주문건수
from 고객;

select *
from 고객
where 마일리지 <= (select avg(마일리지)
               from 고객);

-- 50. 옳은것은? 2번.
# 모든 서브쿼리는 조인으로 대체할 수 있다.
# having 절에도 서브쿼리 작성할 수 있다.
# from 절에서 서브쿼리 작성할때 별명을 생략할 수 있다.
# select 절에는 서브쿼리를 작성할 수 없다.

-- 51. 오류발생하지 않는 문장은?
select *
from 주문
where 주문번호 = (select 고객번호
              from 고객
              where 담당자명 = '한회수');

select *
from 주문
where 고객번호 = (select 고객번호, 고객회사명 -- operant should contain 1 column
              from 고객
              where 담당자명 = '한회수');

select *
from 주문
where 고객번호 = (select 고객번호
              from 고객); -- subquery returns more than 1 row!

select *
from 주문
where 고객번호 not in (select 고객번호
                   from 고객
                   where 마일리지 <= 1000);

-- 52. 제품 테이블에 있는 제품 중 단가가 가장 높은 제품명?
-- 컬럼에서 제일 큰 값 하나 가져오기?
# select 제품명, max(단가) as 최대단가
# from 제품
# group by 제품명;

-- [2025-03-10 18:41:14] [42000][1140] In aggregated query without GROUP BY, expression #1 of SELECT list contains nonaggregated column '신세계무역.제품.제품명'; this is incompatible with sql_mode=only_full_group_by

SELECT MAX(단가) AS 최대단가금액
FROM 제품;
-- 실행 가능!

-- 53. 단가가 가장 높은 제품의 주문 수량합 ?$$$$$$$
-- 주문수량합이란:
#          select * from 제품;
# select * from 주문;
#
# select (
#            SELECT MAX(단가) AS 최대단가금액
#            FROM 제품-- 실행 가능!
#        )
# from 주문세부, 주문
# where 주문세부.주문번호 = 주문.주문번호;

-- 54. 아이스크림 제품의 주문수량합은? $$$$

select *
from 제품;

# select 주문수량
# from 제품, 주문세부
# where 제품.제품번호 = 주문세부.제품번호
# and 제품명 = '아이스크림';

select sum(주문수량) as 주문수량합 -- 집계함수 언제쓸 수 있는지 정확히 조사하기
from 제품
         join 주문세부 on 제품.제품번호 = 주문세부.제품번호
where 제품명 like ('%아이스크림%');

-- 55. 서울 특별시 고객 - 주문년도 별 주문건수 --> 주문년도, 주문건수 컬럼
use 신세계무역;
-- 주문일에서 주문연도만 추출? select year(주문일) as 주문년도 from 주문;
select year(주문일) as 주문년도, sum(주문수량) -- 뭘 sum() 하는걸까 정확히...
from 고객
         join 주문 on 고객.고객번호 = 주문.고객번호
         join 주문세부 on 주문.주문번호 = 주문세부.주문번호
where 도시 = '서울특별시'
group by 주문년도;
-- 오!! 주문년도로 묶어서 나옴.

-- 60. 1번

-- 61. 고객 테이블에 레코드 삽입
select * from 고객;

insert into 고객 (고객번호, 담당자명, 고객회사명, 도시)
values ('ZZZAA', '한동욱', '자유트레이딩', '서울특별시');

-- 62. 컬럼값 변경하기
update 고객
set 도시 = '부산광역시', 마일리지 = 100, 담당자직위 = '대표이사'
where 고객번호 = 'ZZZAA';

-- 63. 대표이사 직위의 평균 마일리지 값 구하기.????
# select avg(마일리지)
# from 사원
# join 주문 on 주문.사원번호 = 사원.사원번호
# join 고객 on 주문.고객번호 = 고객.고객번호
# where 직위 = '대표이사';


-- 64.
select * from 사원 where 사원번호 = 'E15';

insert into 사원 (사원번호, 이름, 직위)
values ('E15', '이석진', '수습사원')
on duplicate key update
사원번호 = values(사원번호), 이름 = values(이름), 직위 = values(직위);

-- 65.
delete from 고객
where 고객번호 = 'ZZZAA';
-- 66.
delete from 사원
where 사원번호 = 'E15';

-- 71.
create table 영화(
    영화번호 char(5),
    타이틀 varchar(100) not null,
    장르  ENUM('코미디', '드라마', '다큐', 'SF', '액션', '역사', '기타') not null,
    배우 varchar(100),
    감독 varchar(50) not null,
    제작사 varchar(50) not null,
    개봉일 datetime,
    등록일 datetime default now()

);
-- 실습문제만 sql 파일에 작성함.
-- 77.
create view view_상위3고객
as select 고객.고객번호, 고객회사명, 담당자명, sum(주문수량 * 단가) 주문금액합
from 고객, 주문, 주문세부
where 고객.고객번호 = 주문.고객번호 -- join
and 주문.주문번호 = 주문세부.주문번호
group by 고객.고객번호, 고객회사명, 담당자명
order by 4 desc
limit 3;

select * from view_상위3고객;

-- 78. 제품명별로 주문수량합과 주문 금액합을 보이는 뷰 생성
create view view_제품명별주문요약(제품명, 주문수량합, 주문금액합) -- 뷰의 컬럼
as select 제품명, sum(주문수량), sum(주문수량 * 주문세부.단가)
from 제품, 주문세부
where 제품.제품번호 = 주문세부.제품번호
group by 제품명;

-- 79.
select * from view_제품명별주문요약
where 주문수량합 >= 1000;

-- 80.
create view view_광역시
as select 고객번호, 고객회사명, 담당자명, 도시
from 고객
where 도시 like '%광역시'
with check option;

