package com.LeahGrace.demo.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository){
        this.repository = repository;
    }
    private Map<Long, Employee> employee = new HashMap<>();

    //CRUD:
    //CREATE - create one employee
    //Read - get one employee by id // get all employees
    //Update - update one employee by id
    //Destroy - delete one employee by id
/*
    @GetMapping("/")
    public List<Employee> all(){
        return new ArrayList<Employee>(Employee.values());
    }
 */

}
