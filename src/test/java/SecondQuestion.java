import java.util.Scanner;

public class SecondQuestion
{
//    public static void main(String[] args){
//        System.out.println("what is your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println(" Hello "  +  name  + " have a good day");
//    }
// question 3
    // verify that user enter the number is int or not for that we used hasnextint method
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
    }

