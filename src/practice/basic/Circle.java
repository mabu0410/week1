package practice.basic;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("nhap ban kinh: ");
        double r = sc.nextDouble();

        System.out.println("chu vi = " + (2*Math.PI*r));
        System.out.println("dien tich = " + (Math.PI*r*r));
    }
}
