package Strings;

import java.util.Scanner;

public class Stringbasic {
    public static void main(String[] args) {
        int a =20;
        float b = 44.344444f;
        // %d and %f is a format specifier
       // %d is used for int and %f is used for float
        // %c is used for char and %s is used for string
//        System.out.printf("the value of a is %d and value of b is %f",a,b);
        // we used .2 so that it will give 2 interger after dot
        System.out.printf("the value of a is %d and value of b is %.2f",a,b);
//        System.out.format("the value of a is %d and value of b is %f",a,b);
//        Scanner sc = new Scanner(System.in);
      // String str = sc.next();
//        String str = sc.nextLine();
//        System.out.println(str);
    }
}
