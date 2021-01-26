-- 마이바티스 테스트용 테이블 생성 질의어
DROP TABLE TEST_BOARD;
CREATE TABLE TEST_BOARD (
	BOARD_NO BIGINT AUTO_INCREMENT PRIMARY KEY,
	BOARD_TITLE VARCHAR(80),
	BOARD_CONTENT LONGTEXT,
	BOARD_WRITER VARCHAR(30),
	REG_DATE DATETIME DEFAULT NOW(),
	UPDATE_DATE DATETIME DEFAULT NOW()
);

SELECT * FROM TEST_BOARD;
-- 테스트 데이터
INSERT INTO TEST_BOARD(BOARD_TITLE, BOARD_CONTENT, BOARD_WRITER)
VALUES ('TESTTITLE', 'TESTCONTENT', 'TEST01');
INSERT INTO TEST_BOARD(BOARD_TITLE, BOARD_CONTENT, BOARD_WRITER)
VALUES ('TESTTITLE1', 'TESTCONTENT1', 'TEST02');
INSERT INTO TEST_BOARD(BOARD_TITLE, BOARD_CONTENT, BOARD_WRITER)
VALUES ('TESTTITLE2', 'TESTCONTENT2', 'TEST03');