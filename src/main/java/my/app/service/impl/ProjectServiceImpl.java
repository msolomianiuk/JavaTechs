package my.app.service.impl;

import my.app.entities.Project;
import my.app.repository.ProjectRepository;
import my.app.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository repository;

    @Override
    public List<Project> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveOrUpdate(Project project) {
        repository.saveAndFlush(project);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
