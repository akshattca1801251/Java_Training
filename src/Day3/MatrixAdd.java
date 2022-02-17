package Day3;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        int[][] mul; //2-d array
        int[][] mul2;
        int[][] mul3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of rows in array: ");
        int r = sc.nextInt();
        System.out.print("Enter The number of Column in array: ");
        int c = sc.nextInt();
        mul = new int[r][c];
        mul2 = new int[r][c];
        mul3 = new int[r][c];
        System.out.println("Enter Elements of first array----");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter the [%d] [%d] element of array 1= ", i, j);
                mul[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Elements of second array----");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Enter the [%d] [%d] element of array 2= ", i, j);
                mul2[i][j] = sc.nextInt();
            }
        }
        System.out.println("First array is ");
        for(int i=0;i< mul.length;i++){
            for(int j=0;j< mul[i].length;j++){
                System.out.print(mul[i][j]+" ");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println("Second array is ");
        for(int i=0;i< mul2.length;i++){
            for(int j=0;j< mul2[i].length;j++){
                System.out.print(mul2[i][j]+" ");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i< mul3.length;i++){
            for(int j=0;j< mul3[i].length;j++){
                mul3[i][j]=mul[i][j]+mul2[i][j];
            }
        }
        System.out.println("Sum of array is ");
        for(int i=0;i< mul3.length;i++){
            for(int j=0;j< mul3[i].length;j++){
                System.out.print(mul3[i][j]+" ");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
