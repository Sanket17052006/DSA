-- LC - 182 : https://leetcode.com/problems/duplicate-emails/

SELECT email 
FROM (
    SELECT email, COUNT(*) AS no_of_email
    FROM person
    GROUP BY email
) AS a
WHERE no_of_email > 1;