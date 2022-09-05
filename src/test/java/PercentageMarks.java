import java.util.Scanner;

public class PercentageMarks {
    public static void main(String[] args){
float total=0;
        Scanner sc = new Scanner(System.in);
        int total_marks = sc.nextInt();
        System.out.println("enter number 1");
        float a=sc.nextInt();
        total = total+a;
        System.out.println("enter number 2");
        float b=sc.nextInt();
        total = total+b;
        System.out.println("enter number 3");
        float c=sc.nextInt();
        total = total+c;
        float grandtotal = total * 100/(total_marks*3);
//        System.out.println(sum);
        System.out.println(" your total percentage " + grandtotal + " percent ");

    }
}
