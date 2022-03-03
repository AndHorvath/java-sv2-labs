SELECT rendeles.id AS rendeles_id, elado.nev AS elado
FROM rendeles JOIN elado ON rendeles.elado_id = elado.id;