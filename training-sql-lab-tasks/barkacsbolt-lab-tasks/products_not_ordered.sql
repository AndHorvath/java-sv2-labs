SELECT termek.nev FROM termek
WHERE termek.id NOT IN (
	SELECT termek_id FROM tetel
);