package day1;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=10;
        do{
            if(i==10){
                System.out.println("Do while loop start");
            }
            System.out.println("The value of i is = "+i);
            i--;
        }while(i>0);
        System.out.println("Do while end");
    }
}
