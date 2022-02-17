package day1;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            if(i==4)
            {
                System.out.println("Breaking the loop");
                break;
            }
            System.out.println("The value of i is = "+i);
        }
//        for (int i=0;i<=10;i++){
//            if(i==4)
//            {
//                System.out.println("Skipping the value");
//                continue;
//            }
//            System.out.println("The value of i is = "+i);
//        }
    }
}
