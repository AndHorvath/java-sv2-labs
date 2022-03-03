SELECT * FROM teacher
WHERE id > 1 AND (city = 'Budapest' OR city = 'Debrecen');

SELECT * FROM student
WHERE id > 1 AND (city = 'Budapest' OR city = 'Debrecen');