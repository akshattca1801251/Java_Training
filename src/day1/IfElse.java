package day1;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age to check vote eligibility: ");
        int age=sc.nextInt();
        if(age<18) {
            System.out.println("not eligible");
        }
         else{
                System.out.println("Eligible");
            }
        }

    }
