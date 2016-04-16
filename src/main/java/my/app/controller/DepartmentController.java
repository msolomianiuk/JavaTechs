package my.app.controller;

import my.app.entities.Department;
import my.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAll(Model model) {

        model.addAttribute("departments", departmentService.getAll());

        return "department/all";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") long id) {

        departmentService.delete(id);

        return "redirect:/department/getAll";
    }

    @RequestMapping(value = "/form")
    public String form(Model model) {
        model.addAttribute("department", new Department());

        return "department/form";
    }

    @RequestMapping(value = "/add")
    public String add(@ModelAttribute Department department) {
        departmentService.saveOrUpdate(department);
        return "redirect:/department/getAll";
    }
}
