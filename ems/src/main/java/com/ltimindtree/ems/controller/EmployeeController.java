package com.ltimindtree.ems.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.ems.entity.EmployeeEntity;
import com.ltimindtree.ems.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
// @RestController
// public class EmployeeController {
//     @Autowired
//     private final EmployeeService employeeService;

   
//     public EmployeeController(EmployeeService employeeService) {
//         this.employeeService = employeeService;
//     }

//     @PostMapping("/employees")
//     public ResponseEntity<String> registerEmployee(@RequestBody EmployeeEntity employee) {
//         String message = employeeService.registerEmployee(employee);
//         return new ResponseEntity<>(message, HttpStatus.OK);
//     }

//     @GetMapping("/employees/{employeeId}")
//     public ResponseEntity<EmployeeEntity> retrieveEmployee(@PathVariable String employeeId) {
//         EmployeeEntity employee = employeeService.retrieveEmployee(employeeId);
//         if (employee == null) {
//             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//         }
//         return new ResponseEntity<>(employee, HttpStatus.OK);
//     }
// }

    @RestController
    @RequestMapping("/employees")
    public class EmployeeController
    {
        @Autowired
        private EmployeeService employeeService;
        @GetMapping
        public ResponseEntity<List<EmployeeEntity>> getAll()
        {
        return new ResponseEntity<>(employeeService.retrieveAll(),HttpStatus.OK);
        }
        @GetMapping("/{id}")
        public ResponseEntity<EmployeeEntity> getById(@PathVariable String id)
        {
        return new ResponseEntity<>(employeeService.retrieveById(id),HttpStatus.OK);
        }
        @DeleteMapping("/{id}")
        public void delete(@PathVariable String id)
        {
            employeeService.delete(id);
        }
        @PostMapping
        public ResponseEntity<EmployeeEntity> create(EmployeeEntity employeeEntity)
        {

        
        return new ResponseEntity<>(employeeService.create(employeeEntity),HttpStatus.OK);
        }
    }
 


