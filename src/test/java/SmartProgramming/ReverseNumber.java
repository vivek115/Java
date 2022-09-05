package SmartProgramming;

public class ReverseNumber {

    public static  void main(String[] args) {
        int number = 3456;
        int rem, rever = 0;
        while(number!=0) {
            rem = number % 10;
            rever = rever * 10 + rem;
            number = number / 10;
        }
        System.out.println(rever);
    }
}
