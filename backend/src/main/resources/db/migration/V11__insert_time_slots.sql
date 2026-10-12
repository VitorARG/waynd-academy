-- 30 blocos de 30 minutos, com 5 minutos de intervalo.
-- O primeiro começa às 06:00 e o último termina às 23:25.

WITH starts AS (
    SELECT (TIME '06:00' + n * INTERVAL '35 minutes')::TIME AS start_time
    FROM generate_series(0, 29) AS g(n)
)
INSERT INTO time_slots (start_time, end_time, active)
SELECT
    start_time,
    (start_time + INTERVAL '30 minutes')::TIME,
    TRUE
FROM starts
ORDER BY start_time;