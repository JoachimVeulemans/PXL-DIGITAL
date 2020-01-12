REM Creating Tables COPY_EMP and SALES_REP that is required for the code examples in lesson 9

CREATE TABLE sales_reps 
  AS
    SELECT employee_id id, last_name name, salary, commission_pct
    FROM   employees where 1=2;
/

CREATE TABLE copy_emp  AS (
  SELECT * 
  FROM employees 
  WHERE 1 = 2)
/
