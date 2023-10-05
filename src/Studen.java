import java.util.Scanner;

public class Studen {
    private int id;

    private String name;

    private String address;

    private int age;

    private String phone;

    private boolean gender;

    public Studen(){

    }

    public Studen(int id, String name, String address, int age, int phone, boolean gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = String.valueOf(phone);
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = String.valueOf(phone);
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Studen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", gender=" + (gender?"nam":"nu") +
                '}';
    }

    public  void setNewId(int index){
        this.id = index+1;
    }
    public  void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap ten cua ban :");
        this.name=(scanner.nextLine());

        System.out.println("hay nhap dia chi cua ban :");
        this.address=scanner.nextLine();

        System.out.println("hay nhap tuoi cua ban :");
        this.age= Integer.parseInt(scanner.nextLine());

        System.out.println("hay nhap so dien thoai cua ban :");
        this.phone= scanner.nextLine();

        System.out.println("nhap gioi tinh cua ban :");

        this.gender= Boolean.parseBoolean(scanner.nextLine());

    }
}
