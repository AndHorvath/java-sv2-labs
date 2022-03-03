SELECT rendeles.id, vasarlo.nev AS ugyfel
FROM rendeles JOIN vasarlo ON rendeles.vasarlo_id = vasarlo.id;