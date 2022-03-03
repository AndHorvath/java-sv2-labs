SELECT rendeles.id AS rendeles_id, termek.nev, rendeles.ido
FROM termek
JOIN tetel ON termek.id = tetel.termek_id
JOIN rendeles ON tetel.rendeles_id = rendeles.id
WHERE rendeles.ido > 12