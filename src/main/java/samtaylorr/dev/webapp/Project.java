package samtaylorr.dev.webapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Project {
    private @Id @GeneratedValue Long id;

    public Project() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    private String projectName;
    private String description;
    private String imageUrl;
    private String repoUrl;

    public Project(Long id, String projectName, String description, String imageUrl, String repoUrl) {
        this.id = id;
        this.projectName = projectName;
        this.description = description;
        this.imageUrl = imageUrl;
        this.repoUrl = repoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id) &&
                Objects.equals(projectName, project.projectName) &&
                Objects.equals(description, project.description) &&
                Objects.equals(imageUrl, project.imageUrl) &&
                Objects.equals(repoUrl, project.repoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectName, description, imageUrl, repoUrl);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", Project Name='" + projectName + '\'' +
                ", description='" + description + '\'' +
                ", image URL ='" + imageUrl + '\'' +
                ", repo URL ='" + repoUrl + '\'' +
                '}';
    }
}
