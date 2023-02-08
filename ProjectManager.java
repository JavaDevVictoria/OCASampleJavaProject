package MySampleProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

class ProjectManager extends Manager {
    private String projectName;

    public ProjectManager(String name, int id, LocalDate dob, Employee[] team, String projectName) {
        super(name, id, dob, team);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
	
	void manage() {
		System.out.println(getName() + " is managing the project named " + getProjectName());
	}

    @Override
    public String toString() {
        return "ProjectManager{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", dob=" + getDob().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", projectName='" + projectName + '\'' +
                ", team=" + Arrays.toString(getTeam()) +
                '}';
    }
}
