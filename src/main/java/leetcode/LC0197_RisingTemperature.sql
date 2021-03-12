select w2.id as id
  from ( select row_number() over (order by recordDate) seq, w.* from weather w ) w1
     , ( select row_number() over (order by recordDate) seq, w.* from weather w ) w2
 where w1.seq = w2.seq - 1
   and timestampdiff(day, w1.recordDate, w2.recordDate) = 1
   and w1.temperature < w2.temperature;
  
-- Best Answer
SELECT weather.id AS 'Id'
  FROM weather
  JOIN weather w ON DATEDIFF(weather.recordDate, w.recordDate) = 1
   AND weather.Temperature > w.Temperature