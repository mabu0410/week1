package practice.oop;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Bao", 23, 9.9);
        Student s2 = new Student("Nghia", 24, 4.4);
        Student s3 = new Student("Hoang", 25, 7.62);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Danh sach sinh vien:");
        for(Student s : list){
            System.out.println(s.toString());
        }

        System.out.printf("Diem trung binh = %.2f\n", averageScore(list));
    }
    public static double averageScore(ArrayList<Student> list){
        double sum = 0;

        for(Student s : list){
            sum += s.getScore();
        }

        return sum / list.size();
    }
}
