package my.app.controller;

import my.app.entities.Team;
import my.app.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAll(Model model) {

        model.addAttribute("teams", teamService.getAll());

        return "team/all";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") long id) {

        teamService.delete(id);

        return "redirect:/team/getAll";
    }

    @RequestMapping(value = "/form")
    public String form(Model model) {
        model.addAttribute("team", new Team());

        return "team/form";
    }

    @RequestMapping(value = "/add")
    public String add(@ModelAttribute Team team) {
        teamService.saveOrUpdate(team);
        return "redirect:/team/getAll";
    }
}
