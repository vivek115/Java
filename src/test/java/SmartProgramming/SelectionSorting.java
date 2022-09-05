package SmartProgramming;

public class SelectionSorting {
    public static  void main(String[] args){
        int[] a={38,53,9,16,15,4,62};
        int temp=0;
        int min;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                // for string we are  using compareto() method
                // if(a[j].CompareTo(a[min])<0)
               if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
for(int i=0;i<a.length;i++){
    System.out.println(a[i]+"");
}
    }
}
