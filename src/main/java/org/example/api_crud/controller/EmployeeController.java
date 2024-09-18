package org.example.api_crud.controller;

import org.example.api_crud.model.Employee;
import org.example.api_crud.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    //Test
    @GetMapping("/")
    public String test(){
        return "Hi";
    }

    //add employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return iEmployeeService.addEmployee(employee);
    }

    //API update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee ){
        return iEmployeeService.updateEmployeeById(id, employee);
    }


    //delete employee
    @DeleteMapping("delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") long id){
        return iEmployeeService.deleteEmployeeById(id);
    }


    //Lay danh sach
    @GetMapping("/list")
    public List<Employee> listEmployee(){
        return iEmployeeService.getAllEmployees();
    }
}
