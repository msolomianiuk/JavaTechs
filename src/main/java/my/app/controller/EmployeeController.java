package my.app.controller;

import my.app.entities.Employee;
import my.app.entities.Manager;
import my.app.service.EmployeeService;
import my.app.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    ManagerService managerService;

    @RequestMapping(value = "/manager/getAll", method = RequestMethod.GET)
    public String getAllManagers(Model model) {

        System.out.println("IN!");

        model.addAttribute("managers", managerService.getAll());

        return "man/all";
    }

    @RequestMapping(value = "/manager/delete")
    public String deleteManager(@RequestParam(value = "id") long id) {

        managerService.delete(id);

        return "redirect:/employee/manager/getAll";
    }

    @RequestMapping(value = "/manager/form")
    public String formMan(Model model) {
        model.addAttribute("manager", new Manager());

        return "man/form";
    }

    @RequestMapping(value = "/manager/add")
    public String addManager(@ModelAttribute Manager manager) {
        managerService.saveOrUpdate(manager);
        return "redirect:/employee/manager/getAll";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAll(Model model) {

        model.addAttribute("employees", employeeService.getAll());

        return "employee/all";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") long id) {

        employeeService.delete(id);

        return "redirect:/employee/getAll";
    }

    @RequestMapping(value = "/form")
    public String form(Model model) {
        model.addAttribute("employee", new Employee());

        return "employee/form";
    }

    @RequestMapping(value = "/add")
    public String add(@ModelAttribute Employee employee) {
        employeeService.saveOrUpdate(employee);
        return "redirect:/employee/getAll";
    }
}
