# Write your MySQL query statement below
-- select user_id,concat(upper(substring(name,1,1)),lower(substring(name,2))) as name from Users order by user_id
SELECT user_id, CONCAT(UCASE(LEFT(name, 1)), LCASE(SUBSTRING(name, 2))) as name
FROM users
order by user_id;