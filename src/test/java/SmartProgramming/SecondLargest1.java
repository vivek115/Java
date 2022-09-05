package SmartProgramming;

public class SecondLargest1 {
    public static  void main(String[] args) {
        int[] a = {6, 8, 2, 4, 3, 1, 5, 7};
        int largest_value=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest_value){
                second_largest=largest_value;
                largest_value=a[i];
            }
            else if(a[i]>second_largest && a[i]!=largest_value){
                second_largest=a[i];
            }
        }
        System.out.println(second_largest);
        System.out.println(largest_value);
    }
}
