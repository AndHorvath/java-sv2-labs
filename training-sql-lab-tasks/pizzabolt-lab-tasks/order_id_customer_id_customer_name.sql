SELECT rendeles.id, vevo_id, nev
FROM rendeles JOIN vevo
ON rendeles.vevo_id = vevo.id;