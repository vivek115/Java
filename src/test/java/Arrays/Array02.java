package Arrays;

public class Array02 {
    public static void main(String[] args) {
        // printing array in reverse order
        int[] marks = {100, 200, 300, 400, 500};
        for (int i = marks.length -1; i>=0; i--) {
            System.out.println(marks[i]);
        }
    }
}
