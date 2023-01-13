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
            System.out.println("1.	Thêm sinh viên vào danh sách.\n");
            System.out.println("2.  Hiển thị danh sách sinh viên.\n");
            select = sc.nextInt();
            sc.nextLine();
            if(select == 1){
                System.out.println("Nhập Họ và Tên: ");
                String name = sc.nextLine();
                System.out.println("Nhập Lớp: ");
                String lop = sc.nextLine();
                System.out.println("Nhập ID: ");
                String id = sc.nextLine();
                System.out.println("Nhập Tuổi: ");
                Integer tuoi = sc.nextInt();
                Student st = new Student(name,tuoi,lop,id);
                dsst.add(st);
            } else if (select == 2) {
                dsst.inDanhSachStudent();
            }
        }while (select != 0);
    }
}
