package my.app.controller;

import my.app.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getMyPage(Model model) {

        model.addAttribute("projects", projectService.getAll());

        return "project/all";
    }


    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") long id) {

        projectService.delete(id);

        return "redirect:/project/getAll";
    }
}
