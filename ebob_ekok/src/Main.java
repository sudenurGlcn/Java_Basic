import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int ebob=1,ekok=1,sayi1,sayi2,kucuk,buyuk,i,j;
        Scanner inp= new Scanner(System.in);
        System.out.print("Sayi1 giriniz: ");
        sayi1=inp.nextInt();
        System.out.print("Sayi2 giriniz: ");
        sayi2=inp.nextInt();
        if(sayi1>sayi2)
        {
            kucuk=sayi2;
            buyuk=sayi1;
        }
        else
        {
            kucuk=sayi1;
            buyuk=sayi2;
        }
        i=kucuk;
        while(i>=1)
        {
            if(kucuk%i==0 && buyuk%i==0)
            {
                ebob=i;
                System.out.println("ebob : " + i);
                break;
            }
            else
            {
                i--;
            }
        }
        j=buyuk;
        while(j<=(kucuk*buyuk))
        {
            if(j%kucuk==0 && j%buyuk==0)
            {
                ekok=j;
                System.out.println("ekok : " + j);
                break;
            }
            else
            {
                j++;
            }
        }
    }
}