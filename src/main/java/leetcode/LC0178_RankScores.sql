select t.c2 as score, t.c1 + 0 as 'Rank' from (
select 
       (@real_rank := IF (@last > a.score, @real_rank := @real_rank + 1, @real_rank ) ) as c1
     , (@last := a.score) as c2
  from scores a,
       ( SELECT @rank := 0, @last := 0, @real_rank := 1 ) AS b
 order by a.score desc
 ) t;

-- Best Answer(It's not my answer)
SELECT
  score,
  @rank := @rank + (@prev <> (@prev := Score)) 'Rank'
FROM
  Scores,
  (SELECT @rank := 0, @prev := -1) init
ORDER BY Score desc;