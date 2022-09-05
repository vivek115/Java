package SmartProgramming;
public class ReverseString {
    public static  void main(String[] args){
        String name="vivek";
        String rev="";
        int length = name.length();
        for(int i=length-1;i>=0;i--){
            rev=rev + name.charAt(i);
        }
        System.out.println(rev);
        System.out.println();
    }
}