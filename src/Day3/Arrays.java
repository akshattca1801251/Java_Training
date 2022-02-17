package Day3;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //syntax
        //int[] variable _name=new int[length];
        //inr[] b; array declaration
        //b=new int[6]      memmory allocation
        Scanner sc=new Scanner(System.in);
        int[] a =new int[5];
        for (int i=0;i<5;i++){
            System.out.printf("Enter %d number=",(i+1));
            a[i]=sc.nextInt();
        }
        System.out.println("Values are");
        for(int j=0;j<5;j++){
            System.out.println(a[j]);
        }
    }
}
