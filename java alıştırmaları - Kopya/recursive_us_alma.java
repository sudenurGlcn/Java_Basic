import java.util.Scanner;
public class Main
{
     static int usHesapla(int m,int n)
    {
        int sonuc=1;
        if(n==0)
         return 1;
        
        else if(m==0)
        return 0;
    
        else
        {
           for(int i=1;i<=n;i++)
		   {
		       sonuc *=m;
		   }
           return sonuc;
        }
        
        
    }
    
	public static void main(String[] args) {
	int us,taban;
	Scanner inp=new Scanner(System.in);
	System.out.print("taban olacak sayiyi giriniz: ");
	taban=inp.nextInt();
	System.out.print("us olacak sayiyi giriniz: ");
	us=inp.nextInt();
    System.out.println("sonuc: " + usHesapla(taban,us));
    
	}
}