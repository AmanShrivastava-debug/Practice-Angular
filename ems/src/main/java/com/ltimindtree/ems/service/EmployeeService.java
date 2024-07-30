package com.ltimindtree.ems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ltimindtree.ems.entity.EmployeeEntity;


import java.util.HashMap;
import java.util.Map;

// @Service
// public class EmployeeService {
//     private Map<String, EmployeeEntity> employees = new HashMap<>();

//     public String registerEmployee(EmployeeEntity employee) {
//         if (employees.containsKey(employee.getEmployeeId())) {
//             return "Employee with ID " + employee.getEmployeeId() + " already exists.";
//         }
//         employees.put(employee.getEmployeeId(), employee);
//         return "Employee registered successfully!";
//     }

//     public EmployeeEntity retrieveEmployee(String employeeId) {
//         return employees.get(employeeId);
//     }
// }


@Service
public class EmployeeService
{
    Map<String,EmployeeEntity> emp=new HashMap<>();
    public EmployeeEntity create(EmployeeEntity employeeEntity)
    {
   
   return emp.put(employeeEntity.getEmployeeId(), employeeEntity);
    }
    public List<EmployeeEntity> retrieveAll()
    {
        return arr;
    }
    public EmployeeEntity retrieveById(String id)
    {
        for(EmployeeEntity emp:arr)
        {
            if(emp.getEmployeeId().equals(id))
            {
                return emp;
            }
    
        }
        return null;

    }
    public void delete(String id)
    {
        for(EmployeeEntity emp1:arr)
        {
            if(emp1.getEmployeeId().equals(id))
            {
                arr.remove(emp1);
            }
        }
        
    }

}
