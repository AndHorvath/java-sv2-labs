SELECT termek.nev AS termek, SUM(tetel.db) AS rendelt_mennyiseg, termek.ar AS ar termek, SUM(tetel.db) AS rendelt_mennyiseg, termek.ar AS ar
FROM termek JOIN tetel ON termek.id = tetel.termek_idel ON termek.id = tetel.termek_id
GROUP BY termek.nev;