select e1.name as 'Employee'
  from Employee e1, Employee e2
 where e1.ManagerId is not null
   and e1.ManagerId = e2.Id
   and e1.Salary > e2.Salary 
  ;


