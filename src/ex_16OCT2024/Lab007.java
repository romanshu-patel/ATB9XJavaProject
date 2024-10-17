package ex_16OCT2024;

import java.util.Scanner;

public class Lab007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String name = sc.nextLine();
        System.out.println("Enter your Age ");
        int age = sc.nextInt();
        System.out.println("Enter your Salary ");
        double salary = sc.nextDouble();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        

}
}