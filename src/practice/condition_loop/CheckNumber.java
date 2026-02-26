package practice.condition_loop;

import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n = sc.nextInt();

        if(n%2==0)
            System.out.println("chan");
        else
            System.out.println("le");

        if(n%3==0)
            System.out.println("chia het cho 3");
    }
}
