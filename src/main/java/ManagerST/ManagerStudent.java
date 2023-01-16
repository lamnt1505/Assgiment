package ManagerST;

import Model.Student;
import Model.StudentClass;

import java.util.ArrayList;

public class ManagerStudent {
    private ArrayList<Student> list = new ArrayList<Student>();

    public ManagerStudent(){
        this.list = new ArrayList<Student>();
    }

    public ManagerStudent(ArrayList<Student> danhsach){
        this.list = danhsach;
    }

    public void add(Student st){
        this.list.add(st);
    }

    public void inDanhSachStudent(){
        for (Student student : list){
            System.out.println(student);
        }
    }

}
