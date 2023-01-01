import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num,counter=0,temp,i,sum=1,total=0;
		int basValue;
		Scanner inp = new Scanner(System.in);
		System.out.print("sayiyi giriniz: ");
		num=inp.nextInt();
		temp=num;
		while(temp != 0)
		{
		    temp= temp/10;
		    counter++;
		    
		}
		temp=num;
		while(temp != 0)
		{
		    basValue=temp%10;
		    
		    for(i=1;i<=counter;i++)
		    {
		        sum=sum*basValue;
		    }
		    total=total+sum;
		     temp=temp/10;
		      sum=1;
		}
		 
	   System.out.println("sayinin basamak toplamı: " + total);
	   if(num==total)
	   {
	       System.out.println("sayi armstrong sayidir");
	   }
	   else
	   {
	       System.out.println("sayi armstrong sayi degildir");
	   }
	
}
}