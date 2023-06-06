import axios from 'axios';
import React from 'react';
import { Link } from 'react-router-dom';

class ProjectList extends React.Component {
    state = {
      projects: []
    }
  
    componentDidMount() {
      axios.get(`http://localhost:8080/project`)
        .then(res => {
          const projects = res.data;
          this.setState({ projects });
        })
    }
  
    render() {
      return (
        <ul className="unordered-list">
          {
            this.state.projects
              .map(project =>
                <Link key={project.id} to={"/project/"+project.id} >{project.projectName} <br /></Link>
              )
          }
        </ul>
      )
    }
}

export default ProjectList;