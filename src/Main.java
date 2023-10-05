import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Studen[] studens = new Studen[100];
        int index = 0;
        while (true) {
            System.out.println("-------chon menu-------");
            System.out.println("1.them sinh vien");
            System.out.println("2.Hien thi danh sach sinh vien");
            System.out.println("3.Cap nhat sinh vien");
            System.out.println("4.Xoa sinh vien");
            System.out.println("5.Thoat");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("nhap so luong sinh vien can them");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        studens[index] = new Studen();
                        studens[index].setNewId(index);
                        studens[index++].input();
                    }
                    System.out.println("them thanh thanh cong");
                    break;
                case 2:
                    System.out.println("danh sach sinh vien: ");
                    for (int i = 0; i < index; i++) {
                        System.out.println(studens[i]);
                    }
                    break;
                case 3:
                    System.out.println("nhap id can sua: ");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < index; i++) {
                        if (studens[i].getId() == idEdit) {
                            System.out.println(studens[i]);
                            studens[i].input();
                            System.out.println("sua thanh cong");
                            return;
                        }
                    }
                    System.out.println("k tim thay sinh vien");
                    break;
                case 4:
                    System.out.println("nhap id can xoa: ");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < index; i++) {
                        if (studens[i].getId() == idDelete) {
                            for (int j = i; j <index ; j++) {
                                studens[j]=studens[j+1];
                            }
                            System.out.println("xoa thanh cong");
                            index--;
                        }
                    }
                    System.out.println("k tim thay sinh vien");
                    break;
                case 5:
                    System.out.println("thoat chuong trinh");
                    System.exit(0);

                default:
                    System.out.println("nhap lai");
                    break;

            }
        }
    }
}
