package my.app.controller;

import my.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getMyPage(Model model) {

        model.addAttribute("customers", customerService.getAll());

        return "customer/all";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") long id) {

        customerService.delete(id);

        return "redirect:/customer/getAll";
    }

    @RequestMapping(value = "/form")
    public String form() {
        return "customer/form";
    }

    @RequestMapping(value = "/add")
    public String add() {





        return "redirect:/customer/getAll";
    }
}