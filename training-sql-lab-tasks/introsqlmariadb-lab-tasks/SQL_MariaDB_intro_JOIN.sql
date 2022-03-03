SELECT
	teacher.name AS 'Teacher',
	COUNT(student.id) AS 'Number of students'
FROM
	teacher INNER JOIN student ON student.teacher_id = teacher.id
GROUP BY teacher.name;