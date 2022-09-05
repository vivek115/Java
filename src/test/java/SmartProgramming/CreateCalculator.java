package SmartProgramming;

import java.util.Scanner;

public class CreateCalculator {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a");
        int a=sc.nextInt();
        System.out.println("enter number b");
        int b=sc.nextInt();
        System.out.println("select symbol(+,-,*,/)");
        String sym=sc.next();
        int res;
        switch (sym){
            case "+": res=a+b;
                System.out.println("addition:"+res);
                break;
            case "-": res=a-b;
                System.out.println("substract:"+res);
                break;
            case "*": res=a*b;
                System.out.println("multiplication:"+res);
                break;
            case "/": res=a/b;
                System.out.println("divide:"+res);
                break;
            default:
                System.out.println("invalid symbol");
        }
    }
}
