package org.example.api_crud.service;

import org.example.api_crud.model.Employee;
import java.util.List;

public interface IEmployeeService {

    //Them
    public Employee addEmployeeById(Employee employee);

    //Sua
    public Employee updateEmployeeById(long id,Employee employee);


    //Xoa
    public boolean deleteEmployeeById(long id);

    //Lay danh sach
    public List<Employee> getAllEmployees();


    //Lay ra 1 nguoi
    public Employee getEmployeeById(long id);

    Employee addEmployee(Employee employee);
}
