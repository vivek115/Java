package SmartProgramming;

public class SwapNumbers {
    public static  void main(String[] args){
        // swapping of two number with third variable
        int a=10,b=30;
//        int t;
//        t=a;
//        a=b;
//        b=t;
//        System.out.println("a:"+ a);
//        System.out.println("b:"+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);
    }
    // swapping of two numbers without third variable

}
