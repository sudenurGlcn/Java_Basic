import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num,temp,total=0;
		int basValue;
		Scanner inp = new Scanner(System.in);
		System.out.print("sayiyi giriniz: ");
		num=inp.nextInt();
		temp=num;
		while(temp != 0)
		{
		    basValue=temp%10;
		    total=total+basValue;
		    temp=temp/10;
		}
		 
	   System.out.println("sayinin basamak toplamı: " + total);
	}
}
