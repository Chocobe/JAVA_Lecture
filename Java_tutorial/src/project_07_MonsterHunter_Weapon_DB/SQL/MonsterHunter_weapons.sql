-- MONSTER HUNTER WEAPONS DATABASE

-- 무기DB
CREATE TABLE WEAPONS(
    이름          VARCHAR2(30)    CONSTRAINT WEAPONS_NAME_PK PRIMARY KEY,
    종류          VARCHAR2(20)    NOT NULL,
    공격력        NUMBER(4)       NOT NULL,
    회심          NUMBER(3),      
    등급          NUMBER(2)       NOT NULL,
    속성          VARCHAR2(10),   
    속성값         NUMBER(3),
    슬롯_1        NUMBER(1)       CONSTRAINT WEAPONS_SLOT_1_CH CHECK(슬롯_1 BETWEEN 0 AND 3),
    슬롯_2        NUMBER(1)       CONSTRAINT WEAPONS_SLOT_2_CH CHECK(슬롯_2 BETWEEN 0 AND 3),
    슬롯_3        NUMBER(1)       CONSTRAINT WEAPONS_SLOT_3_CH CHECK(슬롯_3 BETWEEN 0 AND 3),
    소재          VARCHAR(100)    NOT NULL,
    트리종류       VARCHAR2(20)    CONSTRAINT TREE_SORT_FK REFERENCES WEAPON_TREE(종류),
    현재트리값      NUMBER(1)      NOT NULL,
    예리도_1       NUMBER(2),  -- 적
    예리도_2       NUMBER(2),  -- 등
    예리도_3       NUMBER(2),  -- 노
    예리도_4       NUMBER(2),  -- 녹
    예리도_5       NUMBER(2),  -- 청
    예리도_6       NUMBER(2)   -- 백
);

SELECT * FROM WEAPONS;

DESC WEAPONS;

DROP TABLE WEAPONS;

-- 무기트리DB
CREATE TABLE WEAPON_TREE(
    종류      VARCHAR2(20) CONSTRAINT TREE_SORT_PK PRIMARY KEY,
    최종단계   NUMBER(1)
);

SELECT * FROM WEAPON_TREE;

DESC WEAPON_TREE;



-- 테스트 (지울것)
CREATE TABLE DEFAULT_TEST(
    SEX     CHAR(2)         DEFAULT '남'
    CONSTRAINT DEFAULT_TEST_SEX_CH CHECK(SEX IN('남', '여')),
    NAME    VARCHAR2(20)
);

CREATE TABLE DEFAULT_TABLE(
    NO      NUMBER(2),
    SEX     CHAR(2) DEFAULT '남'
    CONSTRAINT DEFAULT_TABLE_SEX_CH CHECK(SEX IN('남', '여'))
);

SELECT SEARCH_CONDITION FROM USER_CONSTRAINTS
WHERE CONSTRAINT_NAME = 'DEFAULT_TABLE_SEX_CH'
ORDER BY CONSTRAINT_NAME;