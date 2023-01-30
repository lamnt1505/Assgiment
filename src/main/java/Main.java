import ManagerST.ManagerStudent;
import ManagerST.ManagerStudentClass;
import Model.Student;
import Model.StudentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ManagerStudent dsst = new ManagerStudent();
        StudentClass studentClass1 = new StudentClass(1,"Lỳ");
        StudentClass studentClass2 = new StudentClass(2,"Hóa");
        StudentClass studentClass3 = new StudentClass(3,"IT");
        List<StudentClass> studentClassesArray = new ArrayList<>();
        studentClassesArray.add(studentClass1);
        studentClassesArray.add(studentClass2);
        studentClassesArray.add(studentClass3);

        int select = 0;

        do {
            System.out.println("MENU---------");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("1.Thêm sinh viên vào danh sách.");
            System.out.println("2.Hiển thị danh sách sinh viên.");
            System.out.println("3.Hiển thị danh sách sinh viên theo lớp.");

            select = sc.nextInt();
            sc.nextLine();

            if(select == 1){
                System.out.println("Nhập Họ và Tên:");
                String name = sc.nextLine();
                System.out.println("Nhập Tuổi:");
                Integer tuoi = sc.nextInt();
                System.out.println("Chọn lớp cho sinh viên");
                String studentClass = sc.nextLine();
                for (int i=0;i < studentClassesArray.size(); i++) {
                    System.out.println(i + 1 +": Lớp "+ studentClassesArray.get(i).toString());
                }
                Student st = new Student(name,tuoi);
                dsst.add(st);
            } else if (select == 2) {
                dsst.inDanhSachStudent();
            } else if (select == 3) {
            }
        }while (select != 0);
    }
}
