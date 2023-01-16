package Model;

public class StudentClass {
    String id;
    String studentClass;

    public StudentClass() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public StudentClass(String id, String studentClass) {
        this.id = id;
        this.studentClass = studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
}
