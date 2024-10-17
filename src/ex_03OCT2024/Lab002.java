package ex_03OCT2024;

public class Lab002 {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        int c= 30;
        int MaxValue=  (a>=b && a>=c)? a : (b >=c? b : c);
        System.out.println("Largest Number: " + MaxValue);
    }
}
