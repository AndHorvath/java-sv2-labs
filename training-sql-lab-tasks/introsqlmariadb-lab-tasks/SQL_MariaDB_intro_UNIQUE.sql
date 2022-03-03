ALTER TABLE student
MODIFY email VARCHAR(200) UNIQUE;

INSERT INTO student
	(name_of_student, course, city, email, teacher_id, credit, acitve)
VALUES
	('Student G', 'Dotnet', 'Szeged', 'studentg@gmail.com', 2, 30, 1);