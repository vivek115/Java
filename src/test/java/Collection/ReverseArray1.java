package Collection;

public class ReverseArray1 {
    public static void main(String[] args) {
        int[] a={10,20,45,65,78,96};
        int start=0;
        int end=5;
        int temp;
        while(start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
