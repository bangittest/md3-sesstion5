package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhap a: ");
        double a=scanner.nextDouble();
        System.out.println("nhap b: ");
        double b=scanner.nextDouble();
        System.out.println("nhap c: ");
        double c=scanner.nextDouble();

        QuadraticEquation equation=new QuadraticEquation(a,b,c);
        double discriminant =equation.getDiscriminant();
        if (discriminant >0){
            double root1=equation.getRoot1();
            double root2=equation.getRoot2();
            System.out.println("2 nghiem phan biet la: " +"x1 = "  + root1  + " , "+"x2=" + root2);
        }else if (discriminant ==0){
            double root=equation.getRoot1();
            System.out.println("1 nghiem la: " +root);
        }else {
            System.out.println("vo nghiem");
        }
    }
}
