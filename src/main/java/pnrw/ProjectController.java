package pnrw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
    @GetMapping("/projects")
    public String viewProjects() {
        return "Projects";
    }
}
