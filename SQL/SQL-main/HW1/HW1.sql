use hw1;

-- 1 Создайте таблицу с мобильными телефонами, используя графический интерфейс. Заполните БД данными.
select * from new_table;

-- 2 Выведите название, производителя и цену для товаров, количество которых превышает 2
select ProdName,Manuf,Price
from new_table
where Count > 2;

-- 3 Выведите весь ассортимент товаров марки “Samsung”
select *
from new_table
where Manuf = "Samsung";

-- 4 Выведите информацию о телефонах, где суммарный чек больше 100 000 и меньше 145 000**
select *
from new_table
where Price*Count > 100000 and Price*Count < 145000;

-- 4 *** С помощью регулярных выражений найти (можно использовать операторы “LIKE”, “RLIKE” для 4.3 ):
	-- v4.1. Товары, в которых есть упоминание "Iphone"
select *
from new_table
where ProdName LIKE '%iP%';

	-- 4.2. "Galaxy"
select *
from new_table
where ProdName LIKE 'Galaxy%';

	-- 4.3.Товары, в которых есть ЦИФРЫ
select *
from new_table
where ProdName RLIKE '[0-9]';   
    
    -- 4.4.  Товары, в которых есть ЦИФРА "8" 
select *
from new_table
where ProdName RLIKE '8';
    
