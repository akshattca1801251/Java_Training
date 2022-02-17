package Day3;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] a; //1-d array
        int[][] mul; //2-d array
        mul = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter the [%d] [%d] element of array= ", i, j);
                mul[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multi Dimensional array is ");
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[i].length; j++) {
                System.out.print(mul[i][j] + " ");
                System.out.print(" ");
            }
        }
    }
}
