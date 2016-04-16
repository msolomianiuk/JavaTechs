package my.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class BoardOfManagers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Manager> managers;


    public BoardOfManagers() {
    }

    public BoardOfManagers(Department department, List<Manager> managers) {

        this.department = department;
        this.managers = managers;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    @Override
    public String toString() {
        return "BoardOfManagers{" +
                "id=" + id +
                ", department=" + department +
                ", managers=" + managers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoardOfManagers that = (BoardOfManagers) o;

        if (id != that.id) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        return managers != null ? managers.equals(that.managers) : that.managers == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (managers != null ? managers.hashCode() : 0);
        return result;
    }
}
