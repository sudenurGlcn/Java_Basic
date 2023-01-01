import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {
        int r;
        double pi,alan,cevre;
        pi=3.14;
        Scanner input= new Scanner(System.in);
        System.out.print("yaricapi giriniz: ");
        r=input.nextInt();
        alan=pi*(r*r);
        cevre=2*pi*r;
        System.out.println("alan: " + alan);
        System.out.print("cevre: " + cevre);

    }
}