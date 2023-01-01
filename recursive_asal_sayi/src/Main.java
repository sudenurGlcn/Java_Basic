import java.util.Scanner;
public class Main
{
    static boolean asalHesapla(int m,int n)
    {

        if(m==n)
            return true;

        else if(m%n==0)
            return false;

        return asalHesapla(m,n+1);


    }

    public static void main(String[] args) {
        int taban;
        Scanner inp=new Scanner(System.in);
        System.out.print(" sayiyi giriniz: ");
        taban=inp.nextInt();
        System.out.println(asalHesapla(taban,2) ? taban + " sayisi asaldır" : taban + "sayisi asal degildir" );

    }
}