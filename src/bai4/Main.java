package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.batQuat(true);

        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.tatQuat(false);


        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());

    }
}
