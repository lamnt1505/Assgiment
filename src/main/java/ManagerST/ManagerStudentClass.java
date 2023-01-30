package ManagerST;

import Model.Student;
import Model.StudentClass;

import java.util.ArrayList;

public class ManagerStudentClass {
    private ArrayList<StudentClass> sc = new ArrayList<StudentClass>();

    public ManagerStudentClass(){
        this.sc = new ArrayList<StudentClass>();
    }


    public ManagerStudentClass(ArrayList<StudentClass> danhsach){
        this.sc = danhsach;
    }

    public ArrayList<StudentClass> getSc() {
        return sc;
    }

    public void setSc(ArrayList<StudentClass> sc) {
        this.sc = sc;
    }

    public void add(StudentClass stud){
        this.sc.add(stud);
    }

    @Override
    public String toString() {
        return "ManagerStudentClass{" +
                "sc=" + sc +
                '}';
    }

    public void inDanhSachStudentClass(){
        for (StudentClass studentclass : sc){
            System.out.println(studentclass);
        }
    }
}
