import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String userName,password,newPassword;
		Scanner inp = new Scanner(System.in);
		System.out.print("Kullanıcı adinizi giriniz: ");
		userName=inp.nextLine();
	   
	    System.out.print("Kullanıcı sifrenizi giriniz: ");
		password=inp.nextLine();
	   
	    if(userName.equals("sude" ) && password.equals("sude123"))
	    {
	             System.out.println("giris basarili");
	    }
	    else
	    {
	          System.out.println("giris basarisiz");
	          int num;
	    System.out.println(" tekrar denemek icin 1'e sifreyi degistirmek icin 2'ye basiniz");
	    num=inp.nextInt();
	    switch (num) 
	    {
	     case 1:
	         Scanner newInp = new Scanner(System.in);
	         System.out.print("Kullanıcı adinizi giriniz: ");
	    	 userName=newInp.nextLine();
	         
	        System.out.print("Kullanıcı sifrenizi giriniz: ");
	    	password=newInp.nextLine();
		   if(userName.equals("sude" ) && password.equals("sude123"))
	        {
	             System.out.println("giris basarili");
	       }
	       else
	       {
	          System.out.println("giris basarisiz");
	       }
	  
	      break;
	      case 2:
	          Scanner newInp2 = new Scanner(System.in);
	          System.out.print("Yeni sifrenizi giriniz: ");
	          newPassword = newInp2.nextLine(); 
	          password=newPassword;
	          System.out.print(password);
	          System.out.print("Kullanıcı adinizi giriniz: ");
		      userName= newInp2.nextLine();
	          System.out.print("Kullanıcı sifrenizi giriniz: ");
		      password= newInp2.nextLine();
		      
		      if(userName.equals("sude" ) && password.equals(password))
	          {
	             System.out.println("giris basarili");
	          }
	          else
	          {
	           System.out.println("giris basarisiz");
	         }
	    }
	    }
	  
	    
}
}