SELECT @pizza_max_id := MAX(id) FROM pizza;

INSERT INTO pizza (id, nev, ar, atmero)
VALUES (@pizza_max_id + 1, 'Cheese', 900, 32);