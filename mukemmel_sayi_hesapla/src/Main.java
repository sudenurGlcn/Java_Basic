import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int sayi,i,sum=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("sayiyi giriniz: ");
        sayi=inp.nextInt();
        for(i=1;i<sayi;i++)
        {
            if(sayi%i==0)
            {
                sum=sum+i;
            }

        }
        System.out.println("toplam: "+sum);
        if(sum==sayi)
        {
            System.out.println( sayi + " mukemmel sayidir");
        }
        else
        {
            System.out.println( sayi + " mukemmel sayi degildir");
        }
    }
}