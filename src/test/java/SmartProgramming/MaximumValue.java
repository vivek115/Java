package SmartProgramming;

public class MaximumValue {
    public static  void main(String[] args) {
        int[] a={10,20,30,50,79,43};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                // for minimum we use if(min>a[i]
                //min=a[i]
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
