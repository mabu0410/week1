package practice.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        try {
            System.out.println("a / b = " + (a / b));
        } catch (ArithmeticException e){
            System.out.println("Loi khong chia duoc cho 0");
        }

        sc.close();

    }
}
