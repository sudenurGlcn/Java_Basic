import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num,total=1,i;
		Scanner inp = new Scanner(System.in);
		System.out.print("sayi giriniz: ");
		num=inp.nextInt();
		for(i=1;i<=num;i++)
		{
		    total=total*i;
		}
		System.out.println("total: " + total);
	}
}
