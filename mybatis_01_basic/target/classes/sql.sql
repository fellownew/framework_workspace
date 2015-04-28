select *from employee

select emp.employee_id,emp.employee_name,emp.email,emp.job_position,emp.salary,emp.hire_date,emp.department_id,dept.department_name,dept.location
from employee emp, department dept
where emp.department_id = dept.department_id



select dept.department_id,dept.department_name,dept.location
from department dept, employee emp
where dept.department_id = emp.department_id

select emp.employee_id,emp.employee_name,emp.email,emp.job_position,emp.salary,emp.hire_date,emp.department_id,dept.department_name,dept.location
from employee emp, department dept
where dept.department_id = 100 and emp.department_id = dept.department_id


create sequence dept_id_seq;

select dept_id_seq.nextval from dual

insert into department values (dept_id_seq.nextval,'우리다음부서','서울');

select *from department