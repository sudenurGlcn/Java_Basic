import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {

        double km,tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("girilcek mesafeyi km olarak giriniz: ");
        km=input.nextDouble();
        tutar= 10 + (km*2.20);

        System.out.println(tutar>20 ? "Tutar: " + tutar : "Tutar:20");

    }
}