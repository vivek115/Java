package SmartProgramming;

public class PrimeNumber {
    // check wheather number is prime number or not
    public static  void main(String[] args){
        int number=7;
        int temp=0;
        for(int i=2;i<=number-1;i++) {
            if (number % i == 0) {
                temp = temp + 1;
            }
        }
            if(temp>0){
                System.out.println("it is not a prime number");
            }
            else{
                System.out.println("it is prime number");
            }
        }
    }

