
-- Задача 1
-- Даны две таблицы: таблица category с полями id и name и таблица page с полями id, name и category_id. Достаньте одним запросом все страницы вместе с их категориями.
 select * 
 from page p left join category c on  p.category_id = c.id;
  
 
--Задача 2
--Даны 3 таблицы: таблица category с полями id и name, таблица sub_category с полями id и name и таблица page с полями id, name и sub_category_id. .
--Достаньте одним запросом все страницы вместе с их подкатегориями и категориями. 


select * 
from page p left join category c on  p.category_id = c.id
			left join sub_category s on c.id=sub_category;
			

--Задача 3 
--Вывести отсортированный по количеству поездок (по убыванию) и имени (по возрастанию) список пассажиров, совершивших хотя бы 1 переезд.

select name,count
from passenger p left join (select passenger,count(pt.Trip)as count
                 from pass_in_trip pt
                 group by passenger) as t on t.passenger=p.id
where count>0
ORDER BY count DESC, name 

/*
таблици выглядят так
Trip

id
trip
company_id
train
town_from
town_to
time_out
time_in


Passenger

id
name


Pass_in_trip

id
trip_id
passenger_id
place


Company

id
name
*/