package my.app.service.impl;

import my.app.entities.Manager;
import my.app.repository.ManagerRepository;
import my.app.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerRepository repository;

    @Override
    public List<Manager> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveOrUpdate(Manager manager) {
        repository.saveAndFlush(manager);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
