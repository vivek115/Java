package Arrays;

public class PR03 {
    public static void main(String[] args) {
        float[] marks = {100.0f,67.8f,40.76f,54.00f,64.56f};
        float sum =0;
        for(float element : marks){
            sum=sum+element;
        }
        System.out.println("the value of avergae marks " + sum/marks.length);
    }
}
