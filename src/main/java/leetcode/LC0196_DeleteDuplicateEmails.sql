delete p
  from Person p
  join ( select rank() over ( partition by Email order by id asc ) as 'rank_val', id from Person ) t
    on p.id = t.id
   and t.rank_val != 1;
  
-- Best Answer But slow
DELETE p1
  FROM Person p1, Person p2
 WHERE 1=1
   AND p1.Email = p2.Email
   AND p1.Id > p2.Id