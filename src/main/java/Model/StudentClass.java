package Model;

public class StudentClass {
    
    int id;
    String studentClass;

    public StudentClass() {
    }

    public StudentClass(int id, String studentClass) {
        this.id = id;
        this.studentClass = studentClass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}
