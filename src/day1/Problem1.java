package day1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Marks:");
        int total_marks=sc.nextInt();
        System.out.println("Enter Subject 1 Marks:");
        float s1=sc.nextInt();
        System.out.println("Enter Subject 2 Marks:");
        float s2=sc.nextInt();
        System.out.println("Enter Subject 3 Marks:");
        float s3=sc.nextInt();
        System.out.println("Enter Subject 4 Marks:");
        float s4=sc.nextInt();
        System.out.println("Enter Subject 5 Marks:");
        float s5=sc.nextInt();
        float sum=s1+s2+s3+s4+s5;
        double percentage=(sum*100)/total_marks;
        System.out.println("Your percentage is="+percentage);
    }
}
