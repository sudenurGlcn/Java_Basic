import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int day;
	String month;
	Scanner inp = new Scanner(System.in);
	
    System.out.print("dogdugunuz ay: ");
    month=inp.nextLine();
    System.out.print("dogdugunuz gun: ");
    day=inp.nextInt();
    if(month.equals("ocak"))
    {
      if(day <=21) 
      {
          System.out.println("Burcunuz: Oglak ");
      }
      else if( day>21 && day<=31)
      {
          System.out.println("Burcunuz: Kova ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    
    else if(month.equals("subat"))
    {
      if(day <=19) 
      {
          System.out.println("Burcunuz: Kova ");
      }
      else if( day>19 && day<=31)
      {
          System.out.println("Burcunuz: Balık ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("mart"))
    {
      if(day <=20) 
      {
          System.out.println("Burcunuz: Balık ");
      }
      else if( day>20 && day<=31)
      {
          System.out.println("Burcunuz: Koc ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("nisan"))
    {
      if(day <=21) 
      {
          System.out.println("Burcunuz: Koc ");
      }
      else if( day>21 && day<=31)
      {
          System.out.println("Burcunuz: Boga ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("mayıs"))
    {
      if(day <=21) 
      {
          System.out.println("Burcunuz: Boga ");
      }
      else if( day>21 && day<=31)
      {
          System.out.println("Burcunuz: ikizler ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("haziran"))
    {
      if(day <=22) 
      {
          System.out.println("Burcunuz: ikizler ");
      }
      else if( day>22 && day<=31)
      {
          System.out.println("Burcunuz: Yengec ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("temmuz"))
    {
      if(day <=22) 
      {
          System.out.println("Burcunuz: Yengec ");
      }
      else if( day>22 && day<=31)
      {
          System.out.println("Burcunuz: Aslan ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("agustos"))
    {
      if(day <=22) 
      {
          System.out.println("Burcunuz: Aslan ");
      }
      else if( day>22 && day<=31)
      {
          System.out.println("Burcunuz: Basak ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("eylul"))
    {
      if(day <=22) 
      {
          System.out.println("Burcunuz: Basak ");
      }
      else if( day>22 && day<=31)
      {
          System.out.println("Burcunuz: Terazi ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    
    else if(month.equals("ekim"))
    {
      if(day <=22) 
      {
          System.out.println("Burcunuz: Terazi ");
      }
      else if( day>22 && day<=31)
      {
          System.out.println("Burcunuz: Akrep ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("kasım"))
    {
      if(day <=21) 
      {
          System.out.println("Burcunuz: Akrep ");
      }
      else if( day>21 && day<=31)
      {
          System.out.println("Burcunuz: Yay ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
    else if(month.equals("aralık"))
    {
      if(day <=21) 
      {
          System.out.println("Burcunuz: Yay ");
      }
      else if( day>21 && day<=31)
      {
          System.out.println("Burcunuz: Oglak ");
      }
      else
      {
          System.out.println("Gecersiz tarih girdiniz");
      }
    }
    
   
    
	    
  }
}
