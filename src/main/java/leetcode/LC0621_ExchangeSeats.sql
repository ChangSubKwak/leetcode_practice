select t.* from (
    select id - 1 as id, s.student from seat s where id mod 2 = 0
    union
    select id + 1 as id, s.student from seat s where id mod 2 = 1 and id != (select count(*) from seat)
    union   
    select id, s.student from seat s where id mod 2 = 1 and id = (select count(*) from seat)
    ) t
 order by t.id asc
-- Best Answer

SELECT
    (CASE
        WHEN MOD(id, 2) != 0 AND counts != id THEN id + 1
        WHEN MOD(id, 2) != 0 AND counts = id THEN id
        ELSE id - 1
    END) AS id,
    student
FROM
    seat,
    (SELECT
        COUNT(*) AS counts
    FROM
        seat) AS seat_counts
ORDER BY id ASC;