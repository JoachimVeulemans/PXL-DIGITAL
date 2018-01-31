SELECT last_name AS "Employee", salary AS "Monthly Salary"
from employees
where (salary > 5000 OR salary < 12000) AND (department_id = 20 OR department_id = 50)
/
