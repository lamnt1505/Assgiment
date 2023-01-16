import ManagerST.ManagerStudent;
import Model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerStudent dsst = new ManagerStudent();
        int select = 0 ;
        do {
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println("1.	Thêm sinh viên vào danh sách.");
            System.out.println("2.  Hiển thị danh sách sinh viên.");
            System.out.println("3.  Hiển thị danh sách sinh viên theo lớp.");
            select = sc.nextInt();
            sc.nextLine();
            if(select == 1){
                System.out.println("Nhập Họ và Tên: ");
                String name = sc.nextLine();
                System.out.println("Nhập ID: ");
                String id = sc.nextLine();
                System.out.println("Nhập Tuổi: ");
                Integer tuoi = sc.nextInt();
                Student st = new Student(name,tuoi,id);
                dsst.add(st);
            } else if (select == 2) {
                dsst.inDanhSachStudent();
            } else if (select == 3) {
            }
        }while (select != 0);
    }
}
