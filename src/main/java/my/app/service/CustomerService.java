package my.app.service;

import my.app.entities.Customer;

public interface CustomerService extends EntityService<Customer> {
    Customer getById(long id);

    Customer getByName(String name);
}
