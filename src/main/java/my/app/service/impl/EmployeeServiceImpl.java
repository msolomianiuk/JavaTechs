package my.app.service.impl;

import my.app.entities.Employee;
import my.app.repository.EmployeeRepository;
import my.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveOrUpdate(Employee employee) {
        repository.saveAndFlush(employee);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
