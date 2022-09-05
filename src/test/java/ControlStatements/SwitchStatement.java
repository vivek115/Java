package ControlStatements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
         switch(age){
             case 18 :
                 System.out.println("GREAT");
                 break;
             case 20:
                 System.out.println("awsome");
                 break;
             case 30 :
                 System.out.println("filler");
                 break;
             default:
                     System.out.println("kuch ni");
         }
        System.out.println("my job");

         // Note: If we are using enhanced switch statement  then we don't need a break statement

        /*
        if(age<14){
            System.out.println("your age is valid");
        }
        else if (age>20){
            System.out.println("you are experienced");
        }
        else if(age>14){
            System.out.println("you are not expereinced ");
        }
        else{
            System.out.println("default value");
        }
    }

         */
    }
}
