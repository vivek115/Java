package Loops;

import java.util.Scanner;

public class DecrementingForLoop {
    public static void main(String[] args) {
//        int n=1;
//        for(int i=5;i>=n;i--){
//            System.out.println(i);
//        }
//        int n=1;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n;i!=0;i--){
            System.out.println(i);
        }

    }
}
