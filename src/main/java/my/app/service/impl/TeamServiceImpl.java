package my.app.service.impl;

import my.app.entities.Team;
import my.app.repository.TeamRepository;
import my.app.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamRepository repository;

    @Override
    public List<Team> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveOrUpdate(Team team) {
        repository.saveAndFlush(team);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }
}
