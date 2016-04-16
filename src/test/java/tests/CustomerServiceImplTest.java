package tests;

import config.TestDataBaseConfig;
import my.app.entities.Customer;
import my.app.entities.Project;
import my.app.service.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    private Customer expected;

    @Before
    public void init() {
        expected = new Customer();
        expected.setId(1);
        expected.setName("my customer");
        Project project = new Project();
        project.setName("my project");
        project.setId(1);
        project.setEmployees(new ArrayList<>());
        expected.setProject(project);
    }

    @Test
    public void getById() throws Exception {

        customerService.saveOrUpdate(expected);

        Customer actual = customerService.getById(expected.getId());

        assertEquals(expected, actual);
    }

    @Test
    public void getByName() throws Exception {
        Customer expected = new Customer();
        expected.setId(1);
        expected.setName("my customer");
        Project project = new Project();
        project.setName("my project");
        project.setId(1);
        project.setEmployees(new ArrayList<>());
        expected.setProject(project);

        customerService.saveOrUpdate(expected);

        Customer actual = customerService.getByName("my customer");

        assertEquals(expected, actual);
    }

    @Test
    public void getAll() throws Exception {
        customerService.getAll().stream().forEach(System.out::println);
    }
}