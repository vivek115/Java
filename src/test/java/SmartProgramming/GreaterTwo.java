package SmartProgramming;

public class GreaterTwo {
    public static  void main(String[] args){
        // greater of two numbers and greater of three numbers
        int a=40,b=30,c=50;
        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>a && b>c){
            System.out.println("b is grater");
        }
        else {
            System.out.println("c is greater");
        }
    }
}
