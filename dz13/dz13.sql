
-- Таблица Employees. Получить список с информацией обо всех сотрудниках
Select * from Employees;

-- Таблица Employees. Получить список всех сотрудников из 50-го отдела (department_id) с зарплатой (salary), более 4000
Select * 
from Employees e 
where salary > 4000 and department_id = 50;

--Получить список список всех ID менеджеров
Select distinct manager_id
from Employees ;

--Таблица Employees. Получить список всех сотрудников, у которых длина имени более 10 букв
Select * 
from Employees e 
where LENGTH(first_name)>10;

--Таблица Employees. Получить список всех сотрудников, пришедших на работу в первый день месяца(Любого).
Select * 
from Employees e 
where hire_date like(01%);



--Таблица Employees. Получить список всех сотрудников и информацию о наличии бонусов к зарплате (yes/no)/
Select *, case when comisiion_rct is null then "NO" else "YES" end as "BONUS?"
from Employees e;

--Таблица countries. Для каждой страны показать регион в котором он находиться: 1-Europa, 2-America, 3 - Asia, 4 - Africa(без Join)
Select distinct(country_name), 
case when region_id = 1 then "Europa"
     when region_id = 2 then "America"
     when region_id = 3 then "Asia"
     when region_id = 4 then "Africa"   
	 else "XZ"
	 end as "Region"
from countries;

--Получить список department_id в котором работают более 30 сотрудников
Select employee_id, department_id
from Employees e 
group by employee_id, department_id
having employee_id > 30;

--Таблица Employees, Jobs, Departments. Показать сотрудников в формате (first_name,job_title,department_name)
Select first_name, job_title, department_name
from Employees e left join Jobs j on e.job_id = j.job_id  	
				 left join Departments d on d.department_id = e.department_id;
				 
				 
				 
				 








