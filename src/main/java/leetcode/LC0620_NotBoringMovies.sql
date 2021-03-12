select *
  from cinema c
 where c.id mod 2 = 1
   and c.description != 'boring'
 order by rating desc
 ;

-- Best Answer

