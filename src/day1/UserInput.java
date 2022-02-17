package day1;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //scanner class is used to take input from keyword
        System.out.println("Taking input from user");
        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter fisrt value:");
//        int a=sc.nextInt();
//        System.out.print("enter second number:");
//        int b=sc.nextInt();
//        System.out.println("Enter third number");
//        float c=sc.nextFloat();
//        System.out.println("Sum of these number is="+(a+b+c));
//        boolean d=sc.hasNextInt();
//        System.out.println(d);
//        String str=sc.next();// it will only print one word
        String str1=sc.nextLine();//it will print whole sentence
        System.out.println(str1);

    }
}
