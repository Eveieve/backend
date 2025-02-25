(1) 단순 질의
① 모든 극장의 이름과 위치를 나타내시오.
    SELECT 극장이름, 위치 FROM 극장;
② ‘잠실’에 있는 극장을 나타내시오.
    SELECT * FROM 극장 WHERE 위치 LIKE '잠실';
③ ‘잠실’에 사는 고객의 이름을 오름차순으로 나타내시오.
    SELECT 고객번호,이름,주소
    FROM 고객
    WHERE 주소 LIKE '잠실'
    ORDER BY 이름;
④ 가격이 8,000원 이하인 영화의 극장번호, 상영관번호, 영화제목을 나타내시오.
    SELECT 극장번호, 상영관번호, 영화제목
    FROM 상영관
    WHERE 가격 <=6000;
⑤ 극장 위치와 고객의 주소가 같은 고객을 나타내시오.
    SELECT 고객.이름, 극장.위치
    FROM 고객, 극장
    WHERE 고객.주소 LIKE 극장.위치;
(2) 집계 질의
  ① 극장의 수는 몇 개인가?
      SELECT COUNT(극장번호)  FROM 극장;
  ② 상영되는 영화의 평균 가격은 얼마인가?
      SELECT AVG(가격) FROM 상영관;
  ③ 2024년 9월 1일에 영화를 관람한 고객의 수는 얼마인가?
     SELECT COUNT(이름) FROM 고객, 예약
     WHERE 예약.고객번호=고객.고객번호 AND 날짜 LIKE '2024-09-01';
(3) 부속질의와 조인
    ① ‘대한’ 극장에서 상영된 영화제목을 나타내시오.
        SELECT 영화제목
        FROM 극장, 상영관
        WHERE 극장.극장번호=상영관.극장번호
        AND 극장이름 LIKE '대한';
     ② ‘대한’ 극장에서 영화를 본 고객의 이름을 나타내시오.
         SELECT 고객.이름
         FROM 극장, 예약, 고객
         WHERE 극장.극장번호=예약.극장번호 AND 예약.고객번호=고객.고객번호
         AND 극장이름 LIKE '대한';
     ③ ‘대한’ 극장의 전체 수입을 나타내시오.
         SELECT SUM(가격)
         FROM 극장, 상영관, 예약
         WHERE 극장.극장번호=상영관.극장번호
         AND 상영관.극장번호=예약.극장번호 AND 상영관.상영관번호=예약.상영관번호;
(4) 그룹 질의
    ① 극장별 상영관 수를 나타내시오.
        SELECT 극장번호, COUNT(*)
        FROM 상영관
        GROUP BY 극장번호;
    ② ‘잠실’에 있는 극장의 상영관을 나타내시오.
        SELECT *
        FROM 극장, 상영관
        WHERE 극장.극장번호=상영관.극장번호 AND 위치 LIKE '잠실';
    ③ 2024년 9월 1일의 극장별 평균 관람 고객 수를 나타내시오.
       SELECT 극장번호, COUNT(*) /COUNT(DISTINCT 극장번호) '평균 관람객 수'
       FROM 예약
       WHERE 날짜 LIKE '2024-09-01'
       GROUP BY 극장번호;
     SELECT count(*) / count(distinct 극장번호) '평균 관람객수'
     FROM 예약
     WHERE 날짜 = date_format('20140901','%Y%m%d');
       2024-09-01에 해당하는 각 극장별 평균 관람 고객 수를 구합니다.
       WHERE  '2024-09-01': 2024년 9월 1일에 대한 데이터만 필터링
       GROUP BY 극장번호: 각 극장별로 데이터를 그룹화
     ④ 2024년 9월 1일에 가장 많은 고객이 관람한 영화를 나타내시오.
        SELECT 영화제목
        FROM 상영관, 예약
        WHERE 상영관.극장번호=예약.극장번호 AND 상영관.상영관번호=예약.상영관번호
        AND 날짜 LIKE '2024-09-01'
        GROUP BY 예약.극장번호, 예약.상영관번호
        HAVING COUNT(*) = (SELECT MAX(*)
        FROM 상영관, 예약
        WHERE 상영관.극장번호=예약.극장번호
        AND 상영관.상영관번호=예약.상영관번호
        AND 날짜 LIKE '2024-09-01'
        GROUP BY 예약.극장번호, 예약.상영관번호);
       SELECT 영화제목
       FROM 상영관,예약
       WHERE 상영관.극장번호=예약.극장번호 and 상영관.상영관번호=예약.상영관번호 and 날짜=date_format('20240901','%Y%m%d')
       GROUP BY 영화제목
       HAVING count(*) = (
	                 SELECT MAX(count)
                                 FROM ( SELECT 영화제목, COUNT(*) 'count'
                                    	FROM 상영관,예약
	                                    WHERE 상영관.극장번호=예약.극장번호 AND 상영관.상영관번호=예약.상영관번호 AND 날짜=date_format('20240901','%Y%m%d')
                           	            GROUP BY 영화제목) view );
(5) DML
   ① 각 테이블에 데이터를 삽입하는 INSERT 문을 하나씩 실행시켜 보시오.
        (생략)
   ② 영화 가격을 10%씩 인상하시오.
       -- MYSQL 업데이트 설정 변경 =>   set sql_safe_update=0;
       UPDATE 상영관
       SET 가격 = 가격 * 1.1;
        UPDATE 상영관
        SET 가격 = 가격 + 가격*0.1;
