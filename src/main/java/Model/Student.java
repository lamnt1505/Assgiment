package Model;

public class Student {

    private String name;

    private Integer tuoi;

    private String id;

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    private StudentClass studentClass;

    public Student() {
    }



    public Student(String name, Integer tuoi, String id) {
        this.name = name;
        this.tuoi = tuoi;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student{" +"name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", id='" + id + '\'' +
                '}';
    }
}
