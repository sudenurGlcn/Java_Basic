import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    	int sayi,enb=Integer.MIN_VALUE,enk=Integer.MAX_VALUE,i,n;
    	Scanner inp=new Scanner(System.in);
    	System.out.print("kac tane sayi girceksiniz: ");
    	n=inp.nextInt();
    	for(i=0;i<n;i++)
    	{
    	    System.out.print("sayi giriniz: ");
    	    sayi=inp.nextInt();
    	    
    	    if(sayi>enb)
    	    {
    	        enb=sayi;
    	    }
    	    
    	    if(sayi<enk)
    	    {
    	        enk=sayi;
    	    }
    	}
    	System.out.println("en buyuk sayi: " + enb);
	    System.out.println("en kucuk sayi: " + enk);
		
	}
}
