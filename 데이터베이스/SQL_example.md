SELECT JOB, ENAME, SAL FROM EMP  E1
WHERE SAL >
(
	SELECT AVG(SAL) FROM EMP E2
	WHERE E1.JOB= E2.JOB 
	GROUP BY JOB
)

//JOB 별 최대 월급을 받는 사람을 조회.

SELECT  DEPTNO,ENAME,SAL FROM EMP  E1
WHERE SAL =
(
	SELECT MAX(SAL) FROM EMP E2
	WHERE E1.JOB= E2.JOB 
	GROUP BY JOB
)


## MS SQL STUDY

- 이중 SELECT 쓰는법

SELECT X FROM Y WHERE X.a = (SELECT ~) :단일 행 SELECT ( Select로 value값을 뽑아내서 비교 ) 
// = , is 
SELECT X FORM Y WHERE X.a in (SELECT ~):다중 행 SELECT ( Select로 여러 값을 뽑아서 그중에 조건에 맞는 값을 선택)
// in , < , > 
