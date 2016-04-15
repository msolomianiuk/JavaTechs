package my.app.controller;

import my.app.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
