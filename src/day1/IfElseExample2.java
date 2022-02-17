package day1;

public class IfElseExample2 {
    public static void main(String[] args) {
        int balance=15000;
        int total;
        if(balance<=20000) {
            total=(balance*12)/100;
            System.out.println("Balane with interest rate="+(total+balance));
        }
        else {
            total=(balance*15)/100;
            System.out.println("Balane with interest rate="+(total+balance));
        }
    }
}
