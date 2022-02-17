package Day3;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[5];
        for (int i=0;i<str.length;i++){
            System.out.printf("Enter %d name=",(i+1));
            str[i]=sc.next();
        }
        System.out.println("Values are");
//        for(int i=0;i<str.length;i++){
//            System.out.println(str[i]);
//        }
//        Using for-each loop------------
        for (String i:str) {
            System.out.println(i);
        }
        // array in reverse-----------------------
        System.out.println("Array in reverse");
        for (int i=((str.length)-1);i>=0;i--){
            System.out.println(str[i]);
        }
    }
}
