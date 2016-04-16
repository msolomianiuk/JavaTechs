package my.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Manager extends Employee {
    @Column
    private int bonus;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "project_id")
    private Project project;

    public Manager() {
    }

    public Manager(int bonus, Project project) {

        this.bonus = bonus;
        this.project = project;
    }

    public Manager(String name, int salary, Department department, List<Team> teams, int bonus, Project project) {
        super(name, salary, department, teams);
        this.bonus = bonus;
        this.project = project;
    }

    public int getBonus() {

        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", project=" + project +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        if (bonus != manager.bonus) return false;
        return project != null ? project.equals(manager.project) : manager.project == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + bonus;
        result = 31 * result + (project != null ? project.hashCode() : 0);
        return result;
    }
}
