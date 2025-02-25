use sakila;
show tables;

desc customer;
-- customer_id, sotre_id, first_name, last_name, email, address_id, active, create_date, last_update

show columns from sakila.customer; -- only in mysql 
show columns from sakila.payment;

select count(customer_id), customer_id -- which customer has how many payments
from payment 
group by customer_id;

-- row_number() functiona ssigns a unique sequential n umber to each row within a parition of a result set 

-- select column1, colum2, 
-- ROW_NUMBER() OVER (PARTITION BY parition_column order by order_column) 
-- from table_name

-- 
select row_number() over(order by amount desc) as num, customer_id, amount -- > assigns a row number(num) to each customer, softed by their 'amount' spent in descending order
from (
-- subquery a table --> groups payments by customer_id
	select customer_id, sum(amount) as amount 
	from payment
    group by customer_id
) as x; -- > uses the subquery 'x'. 

-- 
select staff_id, row_number() over(partition by staff_id order by amount desc, customer_id asc) as num, customer_id, amount
from ( -- from the table I made using subquery 
	select customer_id, staff_id, sum(amount) as amount
    from payment 
    group by customer_id, staff_id
) as x;

-- RANK() 
select * from payment;
select rank() over(order by amount desc) as rankNum, customer_id, amount
from (
	select customer_id, sum(amount) as amount
    from payment 
    group by customer_id
) as x;-- 서브쿼리 이용해서 원하는 부위에서만


