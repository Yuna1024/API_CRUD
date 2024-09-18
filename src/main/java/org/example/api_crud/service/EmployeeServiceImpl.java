package org.example.api_crud.service;

import org.example.api_crud.model.Employee;
import org.example.api_crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee addEmployeeById(Employee employee) {
        if (employee != null) {
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployeeById(long id, Employee employee) {
        if (employee != null) {
            Employee employee1 = employeeRepository.findById(id).get();
            if (employee1 != null) {
                employee1.setName(employee.getName());
                employee1.setAddress(employee.getAddress());

                return employeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployeeById(long id) {
        if(id >= 1){
            Employee employee = employeeRepository.getById(id);
            if (employee != null) {
                employeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }



    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.getById(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }
}
