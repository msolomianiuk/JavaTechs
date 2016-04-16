package my.app.controller;

import my.app.entities.BoardOfManagers;
import my.app.service.BOMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/bom")
public class BOMController {
    @Autowired
    BOMService bomService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAll(Model model) {

        model.addAttribute("boms", bomService.getAll());

        return "bom/all";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") long id) {

        bomService.delete(id);

        return "redirect:/bom/getAll";
    }

    @RequestMapping(value = "/form")
    public String form(Model model) {
        model.addAttribute("bom", new BoardOfManagers());

        return "bom/form";
    }

    @RequestMapping(value = "/add")
    public String add(@ModelAttribute BoardOfManagers boardOfManagers) {
        bomService.saveOrUpdate(boardOfManagers);
        return "redirect:/bom/getAll";
    }
}
