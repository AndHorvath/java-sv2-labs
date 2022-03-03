SELECT
	place_of_birth AS 'Birth place',
	MAX(salary) AS 'Max salary',
	SUM(salary) AS 'Total salary',
	AVG(salary) AS 'Average',
	COUNT(social_security_number) AS 'Number of employees'
FROM emloyees
GROUP BY place_of_birth
HAVING AVG(salary) >= 120000;