SELECT vasarlo.nev, COUNT(vasarlo.nev)
FROM vasarlo JOIN rendeles ON vasarlo.id = rendeles.vasarlo_id
WHERE vasarlo.nev = 'Morgó';