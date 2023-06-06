package samtaylorr.dev.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProjectServiceImplementation implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> fetchAllProjects() {
        List<Project> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects::add);
        return projects;
    }

    @Override
    public Project getProjectById(Long id) {
        Optional<Project> project = projectRepository.findById(id);
        if(project.isPresent()){
            return project.get();
        }
        return null;
    }

    @Override
    public Project updateEmployeeById(Long id, Project project) {
        Optional<Project> project1 = projectRepository.findById(id);
        if(project1.isPresent()){
            Project originalProject = project1.get();

            if (Objects.nonNull(project.getProjectName()) && !"".equalsIgnoreCase(project.getProjectName())) {
                originalProject.setProjectName(project.getProjectName());
            }
            if (Objects.nonNull(project.getDescription()) && !"".equalsIgnoreCase(project.getProjectName())) {
                originalProject.setDescription(project.getDescription());
            }
            if (Objects.nonNull(project.getImageUrl()) && !"".equalsIgnoreCase(project.getImageUrl())) {
                originalProject.setImageUrl(project.getImageUrl());
            }
            if (Objects.nonNull(project.getRepoUrl()) && !"".equalsIgnoreCase(project.getRepoUrl())) {
                originalProject.setRepoUrl(project.getRepoUrl());
            }

            return projectRepository.save(originalProject);
        }

        return null;
    }

    @Override
    public String deleteProjectById(Long id) {
        if(projectRepository.findById(id).isPresent()){
            projectRepository.deleteById(id);
            return "Project deleted successfully";
        }
        return "No such project in the database";
    }
}