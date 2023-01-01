import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int size,i,negativeCounter=0;
        System.out.print("Enter the number of array: ");
        size=inp.nextInt();
        int[] arr=new int[size];
        for( i=0;i<size;i++)
        {
            System.out.println("Enter the elements of array: ");
            arr[i]=inp.nextInt();
        }
        for(i=0;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                int subArray[]=Arrays.copyOfRange(arr,i,j+1);
                if (sumArrElements(subArray) < 0) {
                    negativeCounter++;
                }
            }
        }


    }
    public static int sumArrElements(int[] arr) {
        int total = 0;
        for (int j : arr) {
            total += j;
        }
        return total;
    }



}