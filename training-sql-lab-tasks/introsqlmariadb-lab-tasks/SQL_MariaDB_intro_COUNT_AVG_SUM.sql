SELECT SUM(credit) AS SumCredit FROM student
WHERE city <> 'Budapest';

SELECT COUNT(id) AS NumTeachers FROM teacher
WHERE city = 'Budapest';

SELECT COUNT(id) AS Actual FROM course
WHERE is_active = 1;

SELECT AVG(credit) AS AvgCredit FROM student
WHERE city = 'Budapest';