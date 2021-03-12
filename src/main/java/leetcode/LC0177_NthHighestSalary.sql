CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      select case when count(t2.salary) >= 1 then t2.salary else null end as SecondHighestSalary
        from (
                select t.salary
                  from (
                         select row_number() over (order by salary desc) as rank_num, salary
                           from employee
                          group by salary
                       ) t
                 where t.rank_num = N
             ) t2
          );
END