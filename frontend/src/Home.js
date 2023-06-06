import ProjectList from './ProjectList';
import Header from './Header';

function Home(){
    return (
        <div className="homepage">
            <Header />
            <div className="body">
            <h1 className='title'>Greetings 👋</h1>
            <div className="description">
                My name is Sam Taylor and I'm a Software Engineer. 
                I am proficient in Java and Javascript.
                This website is built as a showcase for my projects that I have built.
                If you have any questions or enquiries, feel free to reach out at 
                <a href = "mailto: taylorsam2401@gmail.com">
                    taylorsam2401@gmail.com
                </a>
                <p>This website is currently using Spring Boot, ReactJS and MySQL</p>
            </div>
            <ProjectList />
        </div>
      </div>
    )
}

export default Home;