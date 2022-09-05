package SmartProgramming;
public class SecondLargest {
    public static  void main(String[] args) {
        int[] a={6,8,2,4,3,1,5,7};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=temp+1;j<a.length;j++){
                if(a[i]<a[j]){
                    // for  smallest we use if(a[i]>a[j])
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("second largest number"+" "+a[1]);
    }
}
