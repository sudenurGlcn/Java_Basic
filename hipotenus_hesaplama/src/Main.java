import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {
        double a, b, c;
        Scanner input = new Scanner (System.in);

        System.out.print ("a kenarini degerini giriniz: ");
        a = input.nextDouble ();

        System.out.print("b kenarini degerini giriniz: ");
        b=input.nextDouble();
        c= Math.sqrt((a*a) + (b*b));
        System.out.println ("a kenarinin degeri: " + a);
        System.out.println ("b kenarinin degeri: " + b);
        System.out.println ("c kenarinin degeri: " + c);
    }
}