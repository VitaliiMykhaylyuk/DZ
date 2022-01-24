Select * from Employees;

Select * 
from Employees e 
where salary > 4000 and department_id = 50;

Select distinct manager_id
from Employees ;

Select * 
from Employees e 
where LENGTH(first_name)>10;


Select * 
from Employees e 
where hire_date like(01%);




Select *, case when comisiion_rct is null then "NO" else "YES" end as "BONUS?"
from Employees e;


Select distinct(country_name), 
case when region_id = 1 then "Europa"
     when region_id = 2 then "America"
     when region_id = 3 then "Asia"
     when region_id = 4 then "Africa"   
	 else "XZ"
	 end as "Region"
from countries;


Select employee_id, department_id
from Employees e 
group by employee_id, department_id
having employee_id > 30;


Select first_name, job_title, department_name
from Employees e left join Jobs j on e.job_id = j.job_id  	
				 left join Departments d on d.department_id = e.department_id;
				 
				 
				 
				 








