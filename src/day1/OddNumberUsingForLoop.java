package day1;

public class OddNumberUsingForLoop {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if(i==0){
                System.out.println("Odd Numbers are: ");
            }
            System.out.println((2*i+1));
        }
    }
}
