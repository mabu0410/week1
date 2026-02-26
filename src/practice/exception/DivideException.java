package practice.exception;

import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("loi chia cho 0");
        }
        finally {
            System.out.printf("hoan thanh");
        }
    }
}
