package my.app.controller;

import my.app.entities.Customer;
import my.app.entities.Project;
import my.app.repository.CustomerRepository;
import my.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/customers")
public class CustomersController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getAll")
    public String getMyPage() {

        System.out.println("in CustomersController");
        Customer customer = new Customer();
        customer.setName("bla");
        Project project = new Project();
        project.setName("blabla");
        customer.setProject(project);
        customerService.saveOrUpdate(customer);

        return "bla";
    }
}