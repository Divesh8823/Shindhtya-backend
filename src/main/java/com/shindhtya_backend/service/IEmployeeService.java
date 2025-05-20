package com.shindhtya_backend.service;

import com.shindhtya_backend.model.EmployeeModel;
import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<EmployeeModel> getAllEmployees();
    Optional<EmployeeModel> getEmployeeById(Long id);
    EmployeeModel saveEmployee(EmployeeModel employee);
    void deleteEmployee(Long id);
}

