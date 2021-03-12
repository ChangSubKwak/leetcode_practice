select d.Name as Department, t.Name as Employee, t.Salary as Salary 
  from (select rank() over (partition by DepartmentId order by Salary desc) as rank_val, Salary ,DepartmentId, Name from employee ) t
     , department d
 where d.id = t.DepartmentId
   and t.rank_val = 1
 ;
