import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String userName,password;
		double balance=1500.0,tutar;
		int i=3,j;
		Scanner inp= new Scanner(System.in);
		while(i>0)
		{
		  System.out.print("kullanıcı adınızı giriniz: ");
		  userName=inp.nextLine();
		  System.out.print("kullanıcı sifrenizi giriniz: ");
		  password=inp.nextLine();
		  if(userName.equals("sude") && password.equals("sude123"))
		  {
		      i=0;
		      System.out.println("Bankamıza hos geldiniz");
		      System.out.println("yapmak istediginiz islemi seciniz ");
		       System.out.println("1:Para Yatırma ");
		       System.out.println("2:Para Cekme ");
		       System.out.println("3:Bakiye Sorgulama ");
		       System.out.println("4:Cıkış yapma");
		       System.out.print("yapmak istediginiz islem: ");
		       j=inp.nextInt();
		       switch(j)
		       {
		           case 1:
		           System.out.print("yatırmak istediginiz tutar:");
		           tutar=inp.nextDouble();
		           balance=balance+tutar;
		           System.out.println("Güncel Bakiyeniz: " + balance);
		           break;
		           
		           case 2:
		           System.out.print("cekmek  istediginiz tutar:");
		           tutar=inp.nextDouble();
		           if(tutar>balance)
		           {
		               System.out.println("İslemi gerceklestirmek icin yeterli bakiyeniz bulunmamaktadır");
		           }
		           else
		           {
		               balance=balance-tutar;
		              System.out.println("Güncel Bakiyeniz: " + balance);
		           }
		           break;
		           case 3:
		           System.out.println("Güncel Bakiyeniz: " + balance);
		           break;
		           case 4:
		           System.out.println("iyi günler tekrar gorusmek uzere");
		           break;
		           
		       }
		       
		  }
		  else
		    {
		       i--;
		         if(i==0)
		        {
		          System.out.println("Hesabınız bloke edilmistir bankayla iletisime geciniz");
		          break;
		        }
		       System.out.println("Kullanici adiniz veya sifreniz yanlis tekrar deneyiniz");
		    }
		    
		}
		
	}
}