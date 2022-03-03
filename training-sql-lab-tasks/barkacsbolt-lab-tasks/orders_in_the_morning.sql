SELECT
rendeles.id AS rendeles_id,
termek.nev AS termek_nev,
rendeles.ido AS rendelesi_ido
FROM rendeles
JOIN tetel ON rendeles.id = tetel.rendeles_id
JOIN termek ON tetel.termek_id = termek.id
WHERE rendeles.ido < 12;