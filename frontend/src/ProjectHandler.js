import axios from 'axios';
import { React, useState } from 'react';
import { useParams } from 'react-router-dom';
import Header from './Header';

function ProjectHandler() { 
    let id = useParams().id;
    
    const [projectName, setProjectName] = useState("Loading...");
    const [description, setDescription] = useState("Loading...");
    const [imageUrl, setImageUrl] = useState("Loading...");
    const [repoUrl, setRepoUrl] = useState("Loading...");

    axios.get(`http://localhost:8080/project/`+id)
        .then(res => {
            setDescription(res.data.description);
            setImageUrl(res.data.imageUrl);
            setProjectName(res.data.projectName);
            setRepoUrl(res.data.repoUrl);
        })

    return (
        <div className='project-page'>
            <Header />
            <div className='body'>
                <div className="image"><img src={imageUrl}></img></div>
                <h1 className="title">{projectName}</h1>
                <div className="description">{description}</div>
                <div className="link"><a href={repoUrl}>{repoUrl}</a></div>
            </div>
            
        </div>
    )
}

export default ProjectHandler;