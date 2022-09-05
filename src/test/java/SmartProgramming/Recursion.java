package SmartProgramming;

public class Recursion {
    static  int fact =1;

    public static void main(String[] args) {
int num=5;
Recursion obj = new Recursion();
obj.calfact(num);
        System.out.println(fact);
    }
    void calfact(int num){
        if(num>=1){
            fact= fact*num;
            calfact(num-1);
        }
    }
}

