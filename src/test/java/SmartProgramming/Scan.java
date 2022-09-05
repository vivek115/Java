package SmartProgramming;

import java.util.Scanner;

public class Scan {
    public static  void main(String[] args){
Scanner  sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.next();
        System.out.println("gender");
        char gender = sc.next().charAt(0);
        System.out.println("age");
        int age = sc.nextInt();
        System.out.println("phone number");
        long phonenumber = sc.nextLong();
        System.out.println("name:" + name);
    }
}
