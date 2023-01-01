import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {
        double boy,kilo,kitleIndex;
        Scanner input = new Scanner(System.in);
        System.out.print("boyunuzu metre cinsinden  giriniz: ");
        boy=input.nextDouble();
        System.out.print("kilonuzu giriniz: ");
        kilo=input.nextDouble();
        kitleIndex=kilo/(boy*boy);
        System.out.println("boy: "+ boy);
        System.out.println("kilo: "+kilo);
        System.out.println("kitle indeksi: "+kitleIndex);


    }
}