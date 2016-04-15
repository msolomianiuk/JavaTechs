package my.app.service.impl;

import my.app.entities.Customer;
import my.app.repository.CustomerRepository;
import my.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public void delete(long id) {
        repository.delete(id);
    }

    @Override
    public Customer getById(long id) {
        return repository.findOne(id);
    }

    @Override
    public Customer getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void saveOrUpdate(Customer customer) {
        repository.saveAndFlush(customer);
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
