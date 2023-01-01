import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4,5, 6, 8, 10};
        double sum = 0.0;
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += 1.0 / arr[i];
        }
        avg = arr.length / sum;
        System.out.println(sum);
        System.out.println(avg);
    }
}