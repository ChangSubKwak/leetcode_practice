select distinct(t.num) as ConsecutiveNums 
  from (
         SELECT num, @count := IF (@prev <> (@prev := num), 0, @count + 1) 'cnt'
           FROM Logs,
                (SELECT @count := 0, @prev := -1) init
       ) t
 where t.cnt >= 2
     ;

-- Best Answer(It's not my answer)
SELECT l1.Num as ConsecutiveNums
FROM
    Logs l1,
    Logs l2,
    Logs l3
WHERE
    l1.Id = l2.Id - 1
    AND l2.Id = l3.Id - 1
    AND l1.Num = l2.Num
    AND l2.Num = l3.Num
    ;