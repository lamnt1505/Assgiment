package Model;

public class Student {
    private String name;

    private Integer tuoi;

    private String id,lop;

    public Student() {
    }

    public Student(String name, Integer tuoi, String id, String lop) {
        this.name = name;
        this.tuoi = tuoi;
        this.id = id;
        this.lop = lop;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
