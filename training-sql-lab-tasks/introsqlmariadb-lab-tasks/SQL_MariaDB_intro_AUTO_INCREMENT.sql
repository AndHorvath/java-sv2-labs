ALTER TABLE student
MODIFY COLUMN id INT NOT NULL AUTO_INCREMENT;

INSERT INTO student
	(name_of_student, course, city, email, teacher_id, credit, acitve)
VALUES
	('Robert Downey Jr.', 'Java', 'Budapest', 'robert@gmail.com', 1, 40, 1),
	('Jon Favreau', 'Python', 'Debrecen', 'jon@gmail.com', 2, 40, 1),
	('Gwyneth Paltrow', 'Java', 'Szeged', 'gwyneth@gmail.com', 3, 30, 1);