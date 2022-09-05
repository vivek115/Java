package SmartProgramming;
public class Practice {
  static   int[] a={4,6,7,5,9,2};
  static   int temp;
    public static void main(String[] args) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
              //  if(a[i]<a[j]){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
//        if(i==1){
//            break;
//        }
        }
        //System.out.println("second largest number"+ "="+a[1]);
        // System.out.println("second smallest number"+ "="+a[0]);
        System.out.println("smallest number"+"="+a[0]);
        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]);
        }
    }
}
