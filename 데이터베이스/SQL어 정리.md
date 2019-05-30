# SQL어 정리

## C

- ` Create Table [테이블명](`

​	`ID VARCHAR(10) PRIMARY KEY,`

​	`NAME VARCHAR(20) NOT NULL,`

​	`SIGNUME NUMBER(10,2) UNIQUE,`

​	`REGDATE DATE NOT NULL`

`)`

## R



## U

##### Table

*제약조건추가*

ALTER TABLE [테이블명]ADD PRIMARY KEY(ID);

ALTER TABLE [테이블명]MODIFY(SIZE NUMBER(5));

ALTER TABLE [테이블명]MODIFY(NAME NOT NULL);

ALTER TABLE [테이블명] MODIFY(PRICE DEFAULT 1000);



*변수 추가*

ALTER TABLE [테이블명]ADD REGDATE(DATE);



*변수 변경*

ALTER TABLE [테이블명]RENAME COLUM SIZE TO CSIZE;

ALTER TABLE [테이블명]RENAME [테이블명2];



##### Value

UPDATE [테이블명] SET [컬럼명]='111' ,[컬럼명2]='222' WHERE ID='ID01';



INSERT INTO [테이블명] VALUE('ID','PW','이름');



## D



## ETC

#### 	COMMENTS : // COMMENTS



