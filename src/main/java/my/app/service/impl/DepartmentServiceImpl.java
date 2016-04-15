package my.app.service.impl;

import my.app.entities.Department;
import my.app.repository.DepartmentRepository;
import my.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository repository;

    @Override
    public List<Department> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveOrUpdate(Department department) {
        repository.saveAndFlush(department);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
