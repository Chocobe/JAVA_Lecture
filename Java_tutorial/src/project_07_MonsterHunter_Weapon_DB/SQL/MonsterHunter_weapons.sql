-- MONSTER HUNTER WEAPONS DATABASE
-- DB id : MONSTER_HUNTER
-- DB pw : tiger

CREATE USER MONSTER_HUNTER IDENTIFIED BY tiger;

GRANT CONNECT, RESOURCE TO MONSTER_HUNTER;

-- 무기DB
CREATE TABLE WEAPONS(
    NAME            VARCHAR2(30)    CONSTRAINT WEAPONS_NAME_PK PRIMARY KEY,
    SORT            VARCHAR2(20)    NOT NULL,
    DAMAGE          NUMBER(4)       NOT NULL,
    CRITICAL        NUMBER(3)       DEFAULT 0,
    GRADE           NUMBER(2)       NOT NULL,
    ATTRIBUTE       VARCHAR2(10)    DEFAULT '무속성',
    ATTRIBUTE_VAL   NUMBER(3)       DEFAULT 0,
    SLOT_1          NUMBER(1)       DEFAULT 0   CONSTRAINT WEAPONS_SLOT_1_CH CHECK(SLOT_1 BETWEEN 0 AND 3),
    SLOT_2          NUMBER(1)       DEFAULT 0   CONSTRAINT WEAPONS_SLOT_2_CH CHECK(SLOT_2 BETWEEN 0 AND 3),
    SLOT_3          NUMBER(1)       DEFAULT 0   CONSTRAINT WEAPONS_SLOT_3_CH CHECK(SLOT_3 BETWEEN 0 AND 3),
    NUM_OF_SLOT     NUMBER(1)       NOT NULL,
    MATERIAL        VARCHAR(100)    NOT NULL,
    TREE            VARCHAR2(20)    NOT NULL,
    TREE_POSITION   NUMBER(2)       NOT NULL,
    SHARPNESS_1     NUMBER(2)       DEFAULT 0,  -- 적
    SHARPNESS_2     NUMBER(2)       DEFAULT 0,  -- 등
    SHARPNESS_3     NUMBER(2)       DEFAULT 0,  -- 노
    SHARPNESS_4     NUMBER(2)       DEFAULT 0,  -- 녹
    SHARPNESS_5     NUMBER(2)       DEFAULT 0,  -- 청
    SHARPNESS_6     NUMBER(2)       DEFAULT 0,  -- 백
    FAVORITE        VARCHAR2(5)     DEFAULT 'FALSE'
);

-- DB 데이터 삽입
INSERT INTO WEAPONS
       VALUES('멸혼의 흉기', '대검', 1008, 0,
              8, '용속성', 150, 
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '네르기간테', 9,
              15, 15, 5, 8, 10, 0,
              'false');

INSERT INTO WEAPONS
       VALUES('네르갈저지', '대검', 912, 0,
              7, '용속성', 150,
              1, 0, 0, 1,
              '멸진룡의 첨예발톱 x 3, 멸진룡의 재생각 x 4, 멸진룡의 꼬리 x 2, 멸진룡의 견갑각 x 2',
              '네르기간테', 8,
              15, 15, 5, 10, 10, 0,
              'false');
              
INSERT INTO WEAPONS
       VALUES('크롬레이지 1', '대검', 720, 0,
              6, '독속성', 330,
              1, 0, 0, 1,
             '유니언광석 x 8, 카브레라이트광석 x 5, 드래그라이트광석 x 10, 용맥의 결정 x 3',
             '네르기간테', 7,
             15, 5, 5, 10, 5, 0,
             'false');

INSERT INTO WEAPONS
       VALUES('황검 리오레우스', '대검', 912, 15,
              8, '화속성', 240, 
              1, 0, 0, 1,
              '염왕룡의 첨예뿔 x 2, 창화룡의 비늘+ x 8, 창화룡의 꼬리 x 3, 화룡의 홍옥 x 1',
              '리오레우스', 9,
              15, 8, 8, 15, 5, 0,
              'false');

-- 테스트 테이블
SELECT * FROM WEAPONS;

DELETE FROM WEAPONS WHERE NAME = '네르갈저지';