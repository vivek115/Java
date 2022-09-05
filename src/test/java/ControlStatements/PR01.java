package ControlStatements;

import java.util.Scanner;

public class PR01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Byte m1,m2,m3;
        System.out.println("marks of math");
        m1 = sc.nextByte();
        System.out.println("marks of math");
        m2 = sc.nextByte();
        System.out.println("marks of math");
        m3= sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("you have passed");
        }
        else{
            System.out.println("not passed");
        }

    }
}
