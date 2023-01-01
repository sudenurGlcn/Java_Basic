import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int yil;
	Scanner inp = new Scanner(System.in);
	System.out.println("Dogdugunuz yili giriniz: ");
	yil = inp.nextInt();
	if( yil%4==0)
	{
	    if(yil%100 != 0)
	    {
	       System.out.println(yil + "ı artik yildir");
	    }
	    
	    else if((yil%100==0) && (yil%400==0))
	    {
	        System.out.println(yil + "ı artik yildir");
	    }
	   else if((yil%100==0) && (yil%400 !=0))
	    {
	       System.out.println(yil + "ı artik yil degildir");
	    }
	    
	   
	}
	else
	{
	    System.out.println(yil + "ı artik yil degildir");
	   
	}
	    
  }
}