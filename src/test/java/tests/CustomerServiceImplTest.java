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

//    @Autowired
//    EntityManagerFactory emf;
//    private EntityManager em;

    @Autowired
    CustomerService customerService;

//    @Before
//    public void setUp() throws Exception {
//        em = emf.createEntityManager();
//    }

    @Test
    public void saveOrUpdate() throws Exception {
        Customer customer = new Customer();
        customer.setName("12345");
        Project project = new Project();
        project.setName("123457890");
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
    public void update() throws Exception {

    }

    @Test
    public void getAll() throws Exception {
        customerService.getAll().stream().forEach(System.out::println);
    }
}