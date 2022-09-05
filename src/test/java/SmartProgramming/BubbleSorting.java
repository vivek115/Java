package SmartProgramming;
public class  BubbleSorting {
    public static void main(String[] args) {
        int[] a = {36, 19, 29, 12, 5};
        int temp;
        for (int i = 0; i < a.length; i++) {
            int flag=0;
            // i used for number of counts
            // j is used for swapping of two adjacent numbers
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // if values are in strings then we CompareTo() method over there
                    // if(a[j].CompareTo(a[j+1])>0)
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag=1;
                }
            }
            System.out.println(a[i]);
            if(flag==0){
                break;
            }
        }
    }
}
