package SmartProgramming;

public class Factorial {
    public static void main(String[] args) {
//        int no =5;
//        int fact=1;
//        for(int i=no;i>=1;i--){
//            fact = fact * i;
//        }
//        System.out.println(fact);
        // or way
        int no = 5;
        int fact = 1;
        for (int i = 1; i <= 5; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
