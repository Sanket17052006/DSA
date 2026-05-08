-- LC - 182 : https://leetcode.com/problems/duplicate-emails/

select c.name as Customers from Customers c where id NOT IN(Select Distinct customerId from orders );