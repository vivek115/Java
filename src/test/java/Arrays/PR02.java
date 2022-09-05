package Arrays;

public class PR02 {
    // Write a program to find out given integer is present in array or not
    public static void main(String[] args) {
        int[] marks = {100,67,40,54,64};
         int num =40;
         boolean isInArray = false;
        for(float element : marks){
           if(num==element){
               isInArray=true;
               break;
           }
        }
if(isInArray){
    System.out.println("the value is present in array");
}else{
    System.out.println("value is not present in array");
}
    }
}
