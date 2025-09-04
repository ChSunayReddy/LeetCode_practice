# Write your MySQL query statement below
-- select * from Users where mail regexp binary '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$';
SELECT *
FROM Users
WHERE REGEXP_Like(mail,'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$','c');