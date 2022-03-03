SELECT * FROM teacher
WHERE id > 1 AND (city = 'Budapest' OR city = 'Debrecen')
ORDER BY id DESC, name ASC;

select * FROM student
WHERE id > 1 AND (city = 'Budapest' OR city = 'Debrecen')
ORDER BY email DESC, name ASC;