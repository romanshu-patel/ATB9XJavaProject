package ex_17OCT2024;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Triangle lengths of side A ");
        int side1 = sc.nextInt();
        System.out.println("Enter Triangle lengths of side B ");
        int side2 = sc.nextInt();
        System.out.println("Enter Triangle lengths of side C ");
        int side3 = sc.nextInt();
        if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("Entered value is invalid");
        }
        else if (side1 == side2 && side2==side3 && side3==side1) {
            System.out.println("Triangle is Equilateral");
        } else if (side1 != side2 && side2 !=side3 && side3 !=side1) {
            System.out.println("Triangle is Scalene");
        }else {
            System.out.println("Triangle is Isosceles");
        }
        sc.close();
    }
}
