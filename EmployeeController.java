
package com.example.EmployeeManagement2.controller;

import com.example.EmployeeManagement2.model.Employee;
import com.example.EmployeeManagement2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();

    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {

        return employeeService.getEmployeeById(id);

    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {

        return employeeService.addEmployee(employee);

    }


    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id,
                                 @RequestBody Employee employee) {

        return employeeService.updateEmployee(id, employee);

    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {

        return employeeService.deleteEmployee(id);

    }
}