package my.app.controller;

import my.app.entities.Manager;
import my.app.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAll(Model model) {

        model.addAttribute("managers", managerService.getAll());

        return "manager/all";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") long id) {

        managerService.delete(id);

        return "redirect:/manager/getAll";
    }

    @RequestMapping(value = "/form")
    public String form(Model model) {
        model.addAttribute("customer", new Manager());

        return "manager/form";
    }

    @RequestMapping(value = "/add")
    public String add(@ModelAttribute Manager manager, Model model) {
        managerService.saveOrUpdate(manager);
        return "redirect:/manager/getAll";
    }
}
