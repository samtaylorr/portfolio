package samtaylorr.dev.webapp;

import java.util.List;

public interface ProjectService {
    Project saveProject(Project project);
    List<Project> fetchAllProjects();
    Project getProjectById(Long id);
    Project updateEmployeeById(Long id, Project project);
    String deleteProjectById(Long id);
}
