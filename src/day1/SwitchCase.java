package day1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter Month : ");
       String month=sc.next();
        switch (month) {
            case "January" -> System.out.println("Month Number is 1");
            case "February" -> System.out.println("Month Number is 2");
            case "March" -> System.out.println("Month Number is 3");
            case "April" -> System.out.println("Month Number is 4");
            default -> System.out.println("enter right month!!!!");
        }
    }
}
