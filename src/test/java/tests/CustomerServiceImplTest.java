package tests;

import my.app.entities.Customer;
import my.app.entities.Project;
import my.app.service.CustomerService;
import config.TestDataBaseConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    @Test
    public void saveOrUpdate() throws Exception {
        Customer customer = new Customer();
        customer.setName("second customer");
        Project project = new Project();
//        project.setName("first project");
//        project.setId(1);
        customer.setProject(project);
        customerService.saveOrUpdate(customer);
    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void getById() throws Exception {

    }
//
//    @Test
//    public void getByName() throws Exception {
//        Customer customer = customerService.getByName("12345");
//        System.out.println(customer);
//        System.out.println(customer.getProject());
//    }

    @Test
    public void getAll() throws Exception {
        customerService.getAll().stream().forEach(System.out::println);
    }
}