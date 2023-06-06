package samtaylorr.dev.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/project")
    public List<Project> getAllProjects(){
        return projectService.fetchAllProjects();
    }

    @GetMapping("/project/{id}")
    public Project getProjectById(@PathVariable("id") Long id){
        return projectService.getProjectById(id);
    }
}
