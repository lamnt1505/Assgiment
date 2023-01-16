package Model;

public class Student {

    private String name;
    private Integer tuoi;
    private StudentClass studentClass;

    public String tenclass(){
        return this.studentClass.getStudentClass();
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public Student() {
    }

    public Student(String name, Integer tuoi) {//StudentClass studentClass
        this.name = name;
        this.tuoi = tuoi;
        //this.studentClass = studentClass;
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


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", tuoi=" + tuoi + '}';
    }//", studentClass=" + studentClass +
}
