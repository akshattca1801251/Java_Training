package Day3;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String str=new String("Akshat");
        String name=" Chauhan";
        System.out.println(str+name);
        //String are immutable can not be changed, you can copy of string object and can modify
        int a=5;
        System.out.printf("The value of a is = %d\n ",a);
        Scanner sc= new Scanner(System.in);
        String str2=sc.nextLine();
        System.out.println(str2);
    }
}
