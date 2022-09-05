package SmartProgramming;
public class Palindrome {
    public static  void main(String[] args){
        int number=121;
        int rev=0,remain;
        int temp=number;
        while(temp!=0){
            remain=temp%10;
            rev=rev*10+remain;
            temp=temp/10;
        }
        if(number==rev){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }

}
