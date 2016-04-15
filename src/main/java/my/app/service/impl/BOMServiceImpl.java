package my.app.service.impl;

import my.app.entities.BoardOfManagers;
import my.app.repository.BOMRepository;
import my.app.service.BOMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BOMServiceImpl implements BOMService {

    @Autowired
    BOMRepository repository;

    @Override
    public List<BoardOfManagers> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveOrUpdate(BoardOfManagers boardOfManagers) {
        repository.saveAndFlush(boardOfManagers);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
