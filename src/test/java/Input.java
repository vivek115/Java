import java.util.Scanner;

public class Input {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.in we used to read from keyboard
        System.out.println("Enter number 1");
        int a =sc.nextInt();
        System.out.println("Enter number 2");
        int b =sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        //String str = sc.next();

        // if we want to print whole syntex then we used nextline method in string
        String str = sc.nextLine();
        System.out.println(str);
    }
}
