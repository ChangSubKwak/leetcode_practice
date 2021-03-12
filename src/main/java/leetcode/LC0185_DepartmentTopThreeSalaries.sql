select d.Name as Department, t.Name as Employee, t.Salary as Salary 
  from ( 
        select   dense_rank() over (partition by DepartmentId order by Salary desc) as rank_val
               , Salary, DepartmentId, Name
          from employee e
       ) t
     , department d
 where d.id = t.DepartmentId
   and t.rank_val <= 3
  order by Department asc, Salary desc
  ;
  
-- Best Answer
select d.Name AS 'Department', e1.Name AS 'Employee', e1.Salary
  FROM Employee e1
  JOIN Department d ON e1.DepartmentId = d.Id
 WHERE 3 > (
             SELECT COUNT(DISTINCT e2.Salary)
               FROM Employee e2
              WHERE 1=1
                and e2.Salary > e1.Salary
                AND e1.DepartmentId = e2.DepartmentId
        )
;