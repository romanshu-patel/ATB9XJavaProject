package ex_17OCT2024;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number between 0 to 100 ");
        int Score= sc.nextInt();
        if (Score>=90 && Score<=100){
            System.out.println("Grade is A");
        } else if (Score>=80 && Score<=89) {
            System.out.println("Grade is B");
        } else if (Score>=70 && Score<=79) {
            System.out.println("Grade is C");
        } else if (Score>=60 && Score<=69) {
            System.out.println("Grade is D");
        }else if (Score>=0 && Score<=59) {
            System.out.println("Grade is F");
        } else {
            System.out.println("Invalid Value entered");
        }
    }
}
