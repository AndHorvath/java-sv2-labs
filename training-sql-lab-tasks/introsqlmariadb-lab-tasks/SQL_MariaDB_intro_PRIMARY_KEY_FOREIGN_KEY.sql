CREATE TABLE course_log (
	id INT NOT NULL AUTO_INCREMENT,
	message VARCHAR(500) NOT NULL,
	course_id INT NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (course_id) REFERENCES course (id)
);