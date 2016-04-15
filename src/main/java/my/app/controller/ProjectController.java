package my.app.controller;

import my.app.entities.Project;
import my.app.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAll(Model model) {

        model.addAttribute("projects", projectService.getAll());

        return "project/all";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") long id) {

        projectService.delete(id);

        return "redirect:/project/getAll";
    }

    @RequestMapping(value = "/form")
    public String form(Model model) {
        model.addAttribute("project", new Project());

        return "project/form";
    }

    @RequestMapping(value = "/add")
    public String add(@ModelAttribute Project project, Model model) {
        projectService.saveOrUpdate(project);
        return "redirect:/project/getAll";
    }
}
