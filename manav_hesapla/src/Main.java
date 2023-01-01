import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {
        double elma,armut,domates,muz,patlıcan,tutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Elma kg: ");
        elma = input.nextDouble();
        System.out.print("armut kg: ");
        armut = input.nextDouble();
        System.out.print("domates kg: ");
        domates = input.nextDouble();
        System.out.print("muz kg: ");
        muz = input.nextDouble();
        System.out.print("patlıcan kg: ");
        patlıcan = input.nextDouble();


        elma =( elma *3.67);
        armut= (armut * 2.14);
        domates= (domates * 1.11 );
        muz=(muz * 0.95);
        patlıcan= (patlıcan * 5);
        tutar= elma+armut+domates+muz+patlıcan;
        System.out.print("toplam tutar: "+tutar);


    }
}