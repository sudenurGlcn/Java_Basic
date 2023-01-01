import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static void frekansBul(int[] dizi,int size)
    {
        int[] frekans = new int[size];
        int i,j;

        for( i=0;i<size;i++)
        {
            frekans[i] = 1;

            for (j = 0; j < size; j++)
            {
               if ((i != j) && (dizi[i] == dizi[j]))
                {
                    frekans[i]++;
                }
            }
        }
        for(i=0;i<size;i++)
        {
           for(j=0;j<size;j++)
           {
               if ((i != j) && (dizi[i] == dizi[j]))
               {
                   dizi[j] = 0;
               }
           }
        }

        for (i = 0; i < size; i++)
        {
            if (frekans[i] > 1)
            {
                if (dizi[i] != 0)
                    System.out.println(dizi[i] + " sayisi " + frekans[i] + " kere tekrar edildi.");
            }
        }

    }
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int size;
        System.out.print("Dizin eleman sayisini giriniz: ");
        size=inp.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print((i+1)+".cı elemani giriniz:");
            arr[i]=inp.nextInt();
        }
        int[] dizi2=new int[size];
        System.out.println();
        System.out.println(Arrays.toString(arr));
        dizi2=arr;
        frekansBul(dizi2,size);



    }
}