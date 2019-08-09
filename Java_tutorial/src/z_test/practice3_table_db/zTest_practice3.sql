--
-- 테이블 생성
CREATE TABLE CLIENT(
    NUM         NUMBER(3),
    NAME        VARCHAR2(8),
    ADDR        VARCHAR2(20)
);

DESC CLIENT;

SELECT * FROM CLIENT;

COMMIT;