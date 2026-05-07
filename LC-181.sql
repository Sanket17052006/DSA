-- LC - 181 : https://leetcode.com/problems/employees-earning-more-than-their-managers/

select a.name as Employee from Employee a join Employee b on a. managerId=b.id where a.salary>b.salary;