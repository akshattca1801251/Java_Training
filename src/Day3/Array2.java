package Day3;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //int[] a =new int[5];
        String[] str=new String[5];
       int[] a= {22,55,88,44,48};
        System.out.println(a.length);
        System.out.println(a[4]);
        a[4]=99;
        System.out.println(a[4]);
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<str.length;i++){
            System.out.printf("Enter %d name=",(i+1));
            str[i]=sc.next();
        }
        System.out.println("Values are");
        for(int j=0;j<str.length;j++){
            System.out.println(str[j]);
        }
    }
}
