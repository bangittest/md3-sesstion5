package bai6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Staff {
    private int id;

    private String name;

    private int age;

    private boolean gender;

    private double rate;

    private double salary;

    public Staff(){

    }

    public Staff(int id, String name, int age, boolean gender, double rate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        this.salary = rate * 1300000;
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }





    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + (gender?"nam":"nu") +
                ", rate=" + rate +
                ", salary=" + formatter.format(salary) + "vnd"+
                '}';
    }

    public  void setNewId(int staffIndex){
        this.id = staffIndex+1;
    }
public void input(){
        Scanner scanner=new Scanner(System.in);
    System.out.println("Nhap ten nhan vien :");
    this.name=scanner.nextLine();
    System.out.println("Nhap tuoi nhan vien : ");
    this.age=scanner.nextInt();
    System.out.println("Nhap gioi tinh nhan vien : ");
    this.gender=scanner.nextBoolean();
    System.out.println("Nhap he so luong cua nhan vien : ");
    this.rate=scanner.nextDouble();
    }
}
