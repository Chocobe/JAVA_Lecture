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

-- 대검
-- [대검-1]
INSERT INTO WEAPONS
       VALUES('멸혼의 흉기', '대검', 1008, 0, 8,
              '용속성', 150,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              15, 15, 5, 8, 10, 0,
              'false');

-- [대검-2]
INSERT INTO WEAPONS
       VALUES('라이트닝퍼니시 3', '대검', 912, 0, 6,
              '뇌속성', 240,
              2, 0, 0, 1,
              '고룡의 피 x 3, 비뢰룡의 전극침+ x 4, 비뢰룡의 첨예발톱 x 6, 용옥 x 1',
              '일반', 8,
              10, 15, 3, 5, 5, 0,
              'false');
              
-- [대검-3]
INSERT INTO WEAPONS
       VALUES('프로스트블레이즈 2', '대검', 768, 0, 6,
              '빙속성', 390,
              2, 0, 0, 1,
              '고룡의 피 x 3, 풍표룡의 첨예발톱 x 5, 풍표룡의 가죽+ x 3, 용옥 x 1',
              '일반', 8,
              5, 5, 10, 10, 5, 0,
              'false');
       
-- [대검-4]
INSERT INTO WEAPONS
       VALUES('자그라스해커 3', '대검', 912, 0, 6,
              '수속성', 300,
              3, 3, 0, 2,
              '시투룡의 첨예발톱 x 2, 적룡의 첨예발톱 x 8, 적룡의 가죽+ x 6, 노바 크리스탈 x 1',
              '일반', 8,
              10, 10, 3, 5, 3, 0,
              'false');

-- [대검-5]
INSERT INTO WEAPONS
       VALUES('마라드하디드 3', '대검', 768, 20, 6,
              '마비속성', 450,
              0, 0, 0, 0,
              '시투룡의 어금니+ x 2, 비적룡의 어금니+ x 5, 비적룡의 두건각+ x 3, 조룡옥 x 1',
              '일반', 8,
              10, 5, 5, 15, 5, 0,
              'false');
              
-- [대검-6]
INSERT INTO WEAPONS
       VALUES('라바블레이즈 2', '대검', 864, 0, 7,
              '화속성', 330,
              2, 2, 0, 2,
              '염왕룡의 갈기 x 2, 용암룡의 지느러미+ x 3, 용암룡의 어금니+ x 3, 용옥 x 1',
              '일반', 8,
              10, 5, 5, 15, 5, 0,
              'false');
       
-- [대검-7]
INSERT INTO WEAPONS
       VALUES('다추라블레이즈 3', '대검', 816, 0, 6,
              '독속성', 540,
              2, 1, 0, 2,
              '시투룡의 날개 x 2, 독요조의 후대+ x 4, 독요조의 날개 x 6, 조룡옥 x 1',
              '일반', 8,
              15, 15, 3, 5, 3, 0,
              'false');
              
-- [대검-8]
INSERT INTO WEAPONS
       VALUES('황검 리오레우스', '대검', 912, 15, 8,
              '화속성', 240,
              1, 0, 0, 1,
              '염왕룡의 첨예뿔 x 2, 창화룡의 비늘+ x 8, 창화룡의 꼬리 x 3, 화룡의 홍옥 x 1',
              '일반', 9,
              15, 5, 5, 15, 5, 0,
              'false');
              
-- [대검-9]
INSERT INTO WEAPONS
       VALUES('가이라블레이즈-수면', '대검', 912, 0, 8,
              '수면속성', 450,
              3, 0, 0, 1,
              '- 제작 불가 -',
              '맘타로트', 1,
              10, 5, 5, 15, 5, 0,
              'false');

-- [대검-10]
INSERT INTO WEAPONS
       VALUES('황제금 대검-용산', '대검', 984, 10, 8,
              '폭파속성', 480,
              1, 0, 0, 1,
              '- 제작 불가 -',
              '역전 맘타로트', 1,
              15, 5, 5, 10, 5, 0,
              'false');
              

-- 태도
-- [태도-1]
INSERT INTO WEAPONS
       VALUES('철도[신락] 2', '태도', 594, 0, 6,
              '수속성', 180,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카르레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 8, 3, 20, 5, 0,
              'false');
              
-- [태도-2]
INSERT INTO WEAPONS
       VALUES('멸절의 일도', '태도', 693, 0, 8,
              '용속성', 120,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              15, 15, 3, 5, 10, 0,
              'false');
              
-- [태도-3]
INSERT INTO WEAPONS
       VALUES('현혹도[섬] 3', '태도', 594, 0, 6,
              '뇌속성', 360,
              3, 0, 0, 1,
              '강룡의 날개 x 2, 현조의 첨예발톱 x 5, 현조의 섬광막 x 3, 조룡옥 x 1',
              '일반', 8,
              10, 5, 5, 20, 5, 0,
              'false');
              
-- [태도-4]
INSERT INTO WEAPONS
       VALUES('알다자주 3', '태도', 561, 20, 6,
              '수면속성', 270,
              0, 0, 0, 0,
              '멸진룡의 첨예발톱 x 2, 소조의 부리+ x 5, 소조의 장식깃털+ x 4, 조룡옥 x 1',
              '일반', 8,
              10, 5, 10, 10, 5, 0,
              'false');
              
-- [태도-5]
INSERT INTO WEAPONS
       VALUES('가이라소드-용산', '태도', 726, -20, 7,
              '폭파속성', 360,
              0, 0, 0, 0,
              '- 제작 불가 -',
              '맘타로트', 1,
              15, 15, 5, 5, 3, 0,
              'false');

-- [태도-6]
INSERT INTO WEAPONS
       VALUES('황제금 태도-마비', '태도', 528, 15, 8,
              '마비속성', 270,
              0, 0, 0, 0,
              '- 제작 불가 -',
              '역전 맘타로트', 1,
              15, 3, 5, 10, 5, 5,
              'false');
              
              
-- 한손검
-- [한손검-1]
INSERT INTO WEAPONS
       VALUES('크롬슬라이서 2', '한손검', 252, 0, 6,
              '수면속성', 240,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 10, 3, 20, 10, 0,
              'false');
              
-- [한손검-2]
INSERT INTO WEAPONS
       VALUES('토멸의 첨병', '한손검', 294, 0, 8,
              '용속성', 150,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              10, 15, 3, 5, 10, 0,
              'false');
              
-- [한손검-3]
INSERT INTO WEAPONS
       VALUES('코로나', '한손검', 266, 20, 7,
              '화속성', 180,
              1, 0, 0, 1,
              '창화룡의 비늘+ x 6, 창화룡의 견갑각 x 4, 창화룡의 날개 x 3, 화룡의 홍옥 x 1',
              '일반', 8,
              10, 5, 5, 10, 5, 0,
              'false');

-- [한손검-4]
INSERT INTO WEAPONS
       VALUES('가이라 슬라이서-환', '한손검', 224, 0, 7,
              '뇌속성', 360,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              15, 10, 3, 3, 5, 0,
              'false');
              
-- [한손검-5]
INSERT INTO WEAPONS
       VALUES('황제금 검-폭파', '한손검', 224, 10, 8,
              '폭파속성', 330,
              1, 0, 0, 1,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              10, 3, 5, 10, 3, 5,
              'false');
              

-- 쌍검
-- [쌍검-1]
INSERT INTO WEAPONS
       VALUES('크롬트윈대거 2', '쌍검', 252, 0, 6,
              '독속성', 270,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 5, 2, 20, 5, 0,
              'false');
              
-- [쌍검-2]
INSERT INTO WEAPONS
       VALUES('잔멸의 발톱', '쌍검', 294, 0, 8,
              '용속성', 120,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              5, 15, 3, 5, 10, 0,
              'false');
              
-- [쌍검-3]
INSERT INTO WEAPONS
       VALUES('듀얼데스테리오 3', '쌍검', 252, 0, 6,
              '뇌속성', 210,
              3, 0, 0, 1,
              '강룡의 날개 x 2, 현조의 첨예발톱 x 5, 현조의 섬광막 x 3, 조룡옥 x 1',
              '일반', 8,
              10, 5, 5, 15, 3, 0,
              'false');
              
-- [쌍검-4]
INSERT INTO WEAPONS
       VALUES('가이라대거-만악', '쌍검', 294, -20, 7,
              '화속성', 240,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              10, 15, 5, 5, 5, 0,
              'false');
              
-- [쌍검-5]
INSERT INTO WEAPONS
       VALUES('황제금 쌍검-얼음', '쌍검', 252, 15, 8,
              '빙속성', 210,
              1, 0, 0, 1,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              3, 5, 5, 15, 10, 0,
              'false');
       

-- 헤머
-- [헤머-1]
INSERT INTO WEAPONS
       VALUES('대귀철 2', '헤머', 936, 0, 6,
              '폭파속성', 270,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 5, 2, 20, 5, 0,
              'false');
              
-- [헤머-2]
INSERT INTO WEAPONS
       VALUES('궤멸의 일격', '헤머', 1092, 0, 8,
              '용속성', 120,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              10, 15, 5, 5, 10, 0,
              'false');
              
-- [헤머-3]
INSERT INTO WEAPONS
       VALUES('코키토스', '헤머', 936, 0, 7,
              '빙속성', 450,
              3, 0, 0, 1,
              '풍표룡의 날개 x 3, 동결주머니 x 4, 강룡의 첨예발톱 x 3, 노바크리스탈 x 6',
              '일반', 7,
              10, 10, 3, 5, 3, 0,
              'false');
              
-- [헤머-4]
INSERT INTO WEAPONS
       VALUES('가이라헤머-골추', '헤머', 988, 10, 7,
              '수면속성', 270,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              10, 15, 3, 5, 3, 0,
              'false');
              
-- [헤머-5]
INSERT INTO WEAPONS
       VALUES('황제금 헤머-비적', '헤머', 936, 20, 8,
              '마비속성', 300,
              1, 0, 0, 1,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              10, 5, 5, 15, 5, 0,
              'false');
              

-- 수렵피리
-- [수렵피리-1]
INSERT INTO WEAPONS
       VALUES('포르티시모 2', '수렵피리', 756, 0, 6,
              '마비속성', 270,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 5, 3, 20, 5, 0,
              'false');
              
-- [수렵피리-2]
INSERT INTO WEAPONS
       VALUES('적멸의 소절', '수렵피리', 882, 0, 8,
              '용속성', 150,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              10, 10, 3, 5, 10, 0,
              'false');
              
-- [수렵피리-3]
INSERT INTO WEAPONS
       VALUES('라이트닝 드럼 3', '수렵피리', 756, 0, 6,
              '뇌속성', 240,
              3, 0, 0, 1,
              '고룡의 피 x 3, 비뢰룡의 전극침+ x 4, 비뢰룡의 첨예발톱 x 6, 용옥 x 1',
              '일반', 8,
              10, 5, 8, 8, 5, 0,
              'false');
              
-- [수렵피리-4]
INSERT INTO WEAPONS
       VALUES('가이라파이프-부공', '수렵피리', 714, 10, 7,
              '수속성', 420,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              10, 5, 10, 10, 5, 0,
              'false');
              
-- [수렵피리-5]
INSERT INTO WEAPONS
       VALUES('황제금 용피리-풍표', '수렵피리', 562, 10, 8,
              '빙속성', 510,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              10, 3, 5, 10, 5, 5,
              'false');
              
              
-- 랜스
-- [랜스-1]
INSERT INTO WEAPONS
       VALUES('크롬란체 2', '랜스', 414, 0, 6,
              '마비속성', 270,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 5, 2, 20, 5, 0,
              'false');
              
-- [랜스-2]
INSERT INTO WEAPONS
       VALUES('블루프로미넌스', '랜스', 437, 20, 8,
              '화속성', 300,
              1, 0, 0, 1,
              '염왕룡의 첨예뿔 x 2, 창화룡의 비늘+ x 8, 창화룡의 꼬리 x 3, 화룡의 홍옥 x 1',
              '일반', 9,
              10, 5, 5, 10, 5, 0,
              'false');
              
-- [랜스-3]
INSERT INTO WEAPONS
       VALUES('라-모르의 애수', '랜스', 460, 0, 8,
              '용속성', 270,
              2, 0, 0, 1,
              '명등룡의 유막 x 3, 시투룡의 첨예발톱 x 6, 시투룡의 꼬리 x 2, 시투룡의 보옥 x 1',
              '일반', 9,
              25, 5, 2, 2, 5, 0,
              'false');
              
-- [랜스-4]
INSERT INTO WEAPONS
       VALUES('가이라 크레프트-참조', '랜스', 437, 30, 7,
              '화속성', 90,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              5, 15, 10, 5, 3, 0,
              'false');
              
-- [랜스-5]
INSERT INTO WEAPONS
       VALUES('황제금 랜스-번개', '랜스', 414, 15, 8,
              '뇌속성', 420,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              10, 3, 3, 10, 10, 0,
              'false');
              
              
-- 건랜스
-- [건랜스-1]
INSERT INTO WEAPONS
       VALUES('크롬건랜스 2', '건랜스', 414, 0, 6,
              '폭파속성', 270,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 5, 3, 20, 5, 0,
              'false');
              
-- [건랜스-2]
INSERT INTO WEAPONS
       VALUES('소멸의 불씨', '건랜스', 483, 0, 8,
              '용속성', 150,
              2, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              10, 10, 5, 5, 10, 0,
              'false');
              
-- [건랜스-3]
INSERT INTO WEAPONS
       VALUES('기에나 캐논 2', '건랜스', 368, 0, 7,
              '빙속성', 360,
              0, 0, 0, 0,
              '강룡의 첨예발톱 x 2, 풍표룡의 첨예발톱 x 5, 풍표룡의 가죽+ x 3, 풍표룡의 보옥 x 1',
              '일반', 8,
              15, 3, 5, 10, 5, 3,
              'false');
              
-- [건랜스-4]
INSERT INTO WEAPONS
       VALUES('가이라버스터-토사', '건랜스', 391, -10, 7,
              '마비속성', 390,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              30, 3, 3, 3, 3, 3,
              'false');
              
-- [건랜스-5]
INSERT INTO WEAPONS
       VALUES('황제금 건랜스-물', '건랜스', 437, 10, 8,
              '수속성', 420,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              5, 5, 5, 10, 5, 0,
              'false');
              

-- 슬래시액스
-- [슬래시액스-1]
INSERT INTO WEAPONS
       VALUES('합금제완성검부 2', '슬래시액스', 630, 0, 6,
              '독속성', 420,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 5, 3, 15, 5, 0,
              'false');
              
-- [슬래시액스-2]
INSERT INTO WEAPONS
       VALUES('레이할로우코람', '슬래시액스', 560, 0, 7,
              '빙속성', 300,
              0, 0, 0, 0,
              '강룡의 첨예발톱 x 2, 풍표룡의 첨예발톱 x 5, 풍표룡의 가죽+ x 3, 풍표룡의 보옥 x 1',
              '일반', 8,
              15, 3, 5, 5, 5, 3,
              'false');
              
-- [슬래시액스-3]
INSERT INTO WEAPONS
       VALUES('볼보그란더 3', '슬래시액스', 735, -20, 6,
              '마비속성', 300,
              2, 1, 0, 2,
              '멸진룡의 큰뿔 x 1, 토사룡의 발톱+ x 5, 토사룡의 견갑 x 5, 용옥 x 1',
              '일반', 8,
              10, 8, 3, 10, 3, 0,
              'false');
              
-- [슬래시액스-4]
INSERT INTO WEAPONS
       VALUES('가이라액스-각', '슬래시액스', 805, -30, 7,
              '빙속성', 240,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              10, 5, 5, 15, 3, 0,
              'false');
              
-- [슬래시액스-5]
INSERT INTO WEAPONS
       VALUES('황제금 슬래시액스-폭린', '슬래시액스', 665, 10, 8,
              '폭파속성', 270,
              1, 0, 0, 1,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              10, 10, 5, 5, 10, 0,
              'false');


-- 차지액스
-- [차지액스-1]
INSERT INTO WEAPONS
       VALUES('크롬가디언 2', '차지액스', 648, 0, 6,
              '뇌속성', 270,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 5, 3, 15, 5, 0,
              'false');
              
-- [차지액스-2]
INSERT INTO WEAPONS
       VALUES('괴멸의 일속', '차지액스', 756, 0, 8,
              '용속성', 150,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              10, 10, 5, 5, 10, 0,
              'false');
              
-- [차지액스-3]
INSERT INTO WEAPONS
       VALUES('증오 [오디엄]', '차지액스', 576, 25, 8,
              '화속성', 180,
              0, 0, 0, 0,
              '염룡의 첨예발톱 x 2, 참조룡의 첨예발톱 x 6, 참조룡의 어금니+ x 5, 참조룡의 보옥 x 1',
              '일반', 8,
              25, 5, 3, 3, 5, 5,
              'false');
              
-- [차지액스-4]
INSERT INTO WEAPONS
       VALUES('가이라암즈-각', '차지액스', 828, -30, 7,
              '빙속성', 210,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              10, 5, 5, 15, 3, 0,
              'false');
              
-- [차지액스-5]
INSERT INTO WEAPONS
       VALUES('황제금 차지액스-얼음', '차지액스', 684, 20, 8,
              '빙속성', 480,
              1, 0, 0, 1,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              5, 5, 5, 15, 10, 0,
              'false');
              
              
-- 조충곤
-- [조충곤-1]
INSERT INTO WEAPONS
       VALUES('크롬블레이드 2', '조충곤', 558, 0, 6,
              '폭파속성', 270,
              1, 1, 0, 2,
              '고룡의 피 x 2, 유니언 광석 x 13, 카브레라이트광석 x 20, 옥염석 x 1',
              '일반', 8,
              5, 5, 2, 15, 5, 0,
              'false');
              
-- [조충곤-2]
INSERT INTO WEAPONS
       VALUES('아르노라스 3', '조충곤', 527, 20, 6,
              '수면속성', 210,
              0, 0, 0, 0,
              '멸진룡의 첨예발톱 x 2, 소조의 부리+ x 5, 소조의 장식깃털+ x 4, 조룡옥 x 1',
              '일반', 8,
              10, 5, 5, 10, 5, 0,
              'false');
              
-- [조충곤-3]
INSERT INTO WEAPONS
       VALUES('다추라블레이드 3', '조충곤', 527, 0, 6,
              '독속성', 390,
              2, 1, 0, 2,
              '시투룡의 날개 x 2, 독요조의 후대+ x 4, 독요조의 날개 x 6, 조룡옥 x 1',
              '일반', 8,
              8, 10, 3, 5, 5, 0,
              'false');
              
-- [조충곤-4]
INSERT INTO WEAPONS
       VALUES('가이라블레이드-현', '조충곤', 589, 0, 7,
              '뇌속성', 300,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              10, 5, 5, 15, 5, 0,
              'false');
              
-- [조충곤-5]
INSERT INTO WEAPONS
       VALUES('황제금 장도-왕', '조충곤', 589, 20, 8,
              '화속성', 270,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              5, 5, 5, 10, 5, 0,
              'false');
              

-- 라이트 보우건
-- [라이트 보우건-1]
INSERT INTO WEAPONS
       VALUES('파멸의 방아쇠', '라이트 보우건', 260, 0, 8,
              '무속성', 0,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [라이트 보우건-2]
INSERT INTO WEAPONS
       VALUES('바젤 타이푼 2', '라이트 보우건', 260, -10, 7,
              '무속성', 0,
              1, 0, 0, 1,
              '염룡의 가루 x 3, 폭린룡의 날개 x 4, 폭린룡의 첨예발톱 x 4, 폭린룡의 보옥 x 1',
              '일반', 8,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [라이트 보우건-3]
INSERT INTO WEAPONS
       VALUES('굴고렛의 규환', '라이트 보우건', 260, 0, 8,
              '무속성', 0,
              2, 0, 0, 1,
              '명등룡의 유막 x 3, 시투룡의 첨예발톱 x 6, 시투룡의 꼬리 x 2, 시투룡의 보옥 x 1',
              '일반', 9,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [라이트 보우건-4]
INSERT INTO WEAPONS
       VALUES('가이라 블리치-박격', '라이트 보우건', 247, 10, 8,
              '무속성', 0,
              3, 0, 0, 1,
              '-- 제작 불가 --',
              '맘타로트', 1,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [라이트 보우건-5]
INSERT INTO WEAPONS
       VALUES('황제금 보우건-폭린', '라이트 보우건', 260, 10, 8,
              '무속성', 0,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              0, 0, 0, 0, 0, 0,
              'false');
              
              
-- 헤비 보우건
-- [헤비 보우건-1]
INSERT INTO WEAPONS
       VALUES('격멸의 포화', '헤비 보우건', 285, 0, 8,
              '무속성', 0,
              1, 0, 0, 1,
              '명등룡의 유각 x 2, 멸진룡의 큰뿔 x 5, 멸진룡의 첨예발톱 x 5, 멸진룡의 보옥 x 1',
              '일반', 9,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [헤비 보우건-2]
INSERT INTO WEAPONS
       VALUES('카디아카', '헤비 보우건', 330, -20, 8,
              '무속성', 0,
              1, 0, 0, 1,
              '명등룡의 꼬리 x 2, 양질의 검은 회오리뿔 x 3, 흑각룡의 견갑각 x 6, 고대의 용골 x 2',
              '일반', 9,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [헤비 보우건-3]
INSERT INTO WEAPONS
       VALUES('퀵 샤프트', '헤비 보우건', 255, 0, 8,
              '무속성', 0,
              1, 0, 0, 1,
              '명등룡의 백각 x 4, 환수의 창각 x 6, 환수의 뇌미 x 3, 노바크리스탈 x 2',
              '일반', 4,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [헤비 보우건-4]
INSERT INTO WEAPONS
       VALUES('가이라 어썰트-폭격', '헤비 보우건', 285, 10, 8,
              '무속성', 0,
              3, 0, 0, 1,
              '-- 제작 불가 --',
              '맘타로트', 1,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [헤비 보우건-5]
INSERT INTO WEAPONS
       VALUES('황제금 포통-비뢰', '헤비 보우건', 285, 15, 8,
              '무속성', 0,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              0, 0, 0, 0, 0, 0,
              'false');
              
              
-- 활
-- [활-1]
INSERT INTO WEAPONS
       VALUES('각왕궁게일혼', '활', 264, -30, 8,
              '빙속성', 150,
              1, 1, 0, 2,
              '명등룡의 꼬리 x 2, 양질의 검은 회오리뿔 x 3, 흑각룡의 견갑각 x 6, 고대의 용골 x 2',
              '일반', 9,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [활-2]
INSERT INTO WEAPONS
       VALUES('제노 메토라', '활', 204, 15, 8,
              '용속성', 180,
              3, 3, 0, 2,
              '명등룡의 유조 x 4, 명등룡의 백각 x 6, 명등룡의 꼬리 x 2, 명등룡의 유옥 x 1',
              '일반', 3,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [활-3]
INSERT INTO WEAPONS
       VALUES('엠프리스 애로우-멸진', '활', 228, 0, 8,
              '폭파속성', 90,
              2, 2, 0, 2,
              '조사단 티켓 x 1, 염비룡의 날개 x 3, 멸진룡의 큰뿔 x 3, 멸진룡의 보옥 x 1',
              '일반', 2,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [활-4]
INSERT INTO WEAPONS
       VALUES('가이라 애로우-여왕', '활', 216, 10, 7,
              '용속성', 330,
              0, 0, 0, 0,
              '-- 제작 불가 --',
              '맘타로트', 1,
              0, 0, 0, 0, 0, 0,
              'false');
              
-- [활-5]
INSERT INTO WEAPONS
       VALUES('황제금 활-시투', '활', 240, 10, 8,
              '용속성', 240,
              1, 0, 0, 1,
              '-- 제작 불가 --',
              '역전 맘타로트', 1,
              0, 0, 0, 0, 0, 0,
              'false');



-- 테스트 테이블
SELECT * FROM WEAPONS;

DELETE FROM WEAPONS;

COMMIT;