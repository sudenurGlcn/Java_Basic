import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static boolean isFind(int[]  arr, int value )
    {
       for(int i:arr) {
           if(i==value)
               return true;
       }
       return false;
    };
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını giriniz: ");

         int size = input.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Dizinin "+(i+1)+". elemanını giriniz: ");
            arr[i]=input.nextInt();
        }

        int index=0;
        int[] tekrar=new int[size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if((arr[i]==arr[j]) && i!=j)
                {
                    if(arr[i]%2==0)
                    {
                        if(!isFind(tekrar,arr[i]))
                        {
                            tekrar[index]=arr[i];
                            index++;
                        }
                        break;

                    }

                }
            }

        }    System.out.println("tekrar eden cift sayilar:\t");
        for(int value:tekrar)
        {
            if(value!=0)
                System.out.print(" " +value);
        }


    }
    }




