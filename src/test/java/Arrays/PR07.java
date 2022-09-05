package Arrays;

public class PR07 {
   //o find minimum value in arrary
   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       int max = Integer.MIN_VALUE;
       for (int e : arr) {
           if(e>max){
               max=e;
           }
       }
       System.out.println(max);
   }
   }
