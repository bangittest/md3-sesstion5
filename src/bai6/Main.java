package bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Staff[]staff=new Staff[5];

        while (true){
            System.out.println("-------chon menu-------");
            System.out.println("1.them nhan vien");
            System.out.println("2.Hien thi danh sach nhan vien");
            System.out.println("3.Thoat");

            int choise=scanner.nextInt();

            switch (choise){
                case 1:
                    System.out.println("nhap so luong nhan vien can them");
                    for (int i = 0; i < staff.length; i++) {
                        staff[i]=new Staff();
                        staff[i].setNewId(i);
                        staff[i].input();
                        staff[i].getSalary();
                    }
                    System.out.println("them moi nhan vien thanh cong");
                    break;
                case 2:
                    System.out.println("danh sach nhan vien :");
                    for (int i = 0; i < staff.length ; i++) {
                        System.out.println(staff[i]);

                    }
            }

        }
    }
}
