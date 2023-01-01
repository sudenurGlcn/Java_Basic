import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int size;
    System.out.println("Enter the size of the array:");
    size=inp.nextInt();
    int[] arr=new int[size];
    for(int i=0; i<size;i++)
    {
        System.out.println("Enter the element at index: "+i);
        arr[i]=inp.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("The sorted array is:" + Arrays.toString(arr));
    }

}