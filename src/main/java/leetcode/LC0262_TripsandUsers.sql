select t.Day_val as 'Day', round(SUM(t.cnt)/max(t.seq), 2) as 'Cancellation Rate'
from ( 
select row_number() over (partition by request_at order by request_at) as seq, request_at as 'Day_val', case when t.status like 'cancelled%' then 1 else 0 end as 'cnt'
  from trips t, users u
 where 1=1
   and (t.client_id = u.users_id)
   and u.banned != 'Yes'
   and request_at >= '2013-10-01'
   and request_at <= '2013-10-03'
   ) t
 group by day_val
;


-- Best Answer
select t.request_at 'Day', round(count(if (t.status like 'cancelled%', TRUE, NULL)) / count(*), 2) 'Rate'
  from trips t
 inner join users u
    on t.client_id = u.users_id and u.banned = 'No'
 where t.request_at between '2013-10-01' and '2013-10-03'
 group by t.request_at