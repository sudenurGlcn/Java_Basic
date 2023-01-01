import java.util.Scanner;

public class Main
{
    static void kontrol(int number)
    {
        int temp=number,reverseNumber=0,lastNumber;
        while(temp !=0)
        {
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
    if(number == reverseNumber)
    {
        System.out.println(number + " sayisi palindrom sayidir ");
    }
    else
    {
        System.out.println(number + " sayisi palindrom sayi değildir ");
    }
        
    }
	public static void main(String[] args) {
	    int sayi;
	    Scanner inp = new Scanner(System.in);
	    System.out.print("sayiyi giriniz: ");
	    sayi=inp.nextInt();
	    kontrol(sayi);
	
	}
}