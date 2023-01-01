import java.util.Scanner;

public class Main
{
   static void topla(int a,int b)
   {
       int result;
       result=a+b;
       System.out.println("Sonuc: " + result);
   }
   
    static void cıkar(int a,int b)
   {
       int result;
       result=a-b;
       System.out.println("Sonuc: " + result);
   }
    static void carp(int a,int b)
   {
       int result;
       result=a*b;
       System.out.println("Sonuc: " + result);
   }
    static void bol(double a,double b)
   {
       double result=0.0;
       if(b==0)
       {
           System.out.println("ikinci sayi 0 dan farklı olmalıdır");
       }
       else
       {
           result=a/b;
       }
       System.out.println("Sonuc: " + result);
   }
    static void uslu(int a,int b)
    {
        int i,sum=1;
       for(i=1;i<=b;i++)
		{
		    sum *=a;
		}
	   System.out.println(a+"^"+b + "=" + sum );
    }
     static void fakt(int a)
     {
         int i,total=1;
		for(i=1;i<=a;i++)
		{
		    total=total*i;
		}
	   System.out.println("sonuc: " + total);
    }
    static void mod(int a,int b)
    {
       int result=0;
       if(b==0)
       {
           System.out.println("ikinci sayi 0 dan farklı olmalıdır");
       }
       else
       {
           result=a%b;
       }
       System.out.println("Sonuc: " + result);
    }
     static void alan(int a,int b)
    {
       int result1=0,result2=0;
       result1=a*b;
       result2=(a+b)*2;
       
       System.out.println("Dikdortgenin alanı: " + result1);
       System.out.println("Dikdortgenin cevresi: " + result2);
    }
 
	public static void main(String[] args) {
	    int sayi1,sayi2,select,select2;
	    double sayi,sayii;
	    Scanner inp=new Scanner(System.in);
	    String menu= "1-Toplama İşlemi \n"
	    +"2-Cıkarma İşlemi \n"
	    +"3-Carpma işlemi \n "
	    +"4-Bolme işlemi \n"
	    +"5 Uslu Sayi Hesaplama\n"
	    +"6-Faktoriyel Hesaplama\n"
	    +"7-Mod Alma\n"
	    +"8-Dikdörtgen Alan ve Çevre Hesabı\n"
	    +"0-Cıkıs yapma"; 
	    
	    do{
	        System.out.println(menu);
	        System.out.print("lutfen yapmak istediginiz islemi seciniz: ");
	        select=inp.nextInt();
	       
	        
	        switch (select) 
	        { 
	            case 1:
	            System.out.print("ilk sayiyi giriniz: ");
	            sayi1=inp.nextInt();
	            System.out.print("ikinci sayiyi giriniz: ");
	            sayi2=inp.nextInt();
	            topla(sayi1,sayi2);
	            System.out.print("Baska bir islem yapmak icin 1'e cıkıs yapmak icin 0 a basınız ");
	            select2=inp.nextInt();
	            if(select2 == 0)
	            {
	                select=0;
	            }
	            break;
	            
	            case 2:
	            System.out.print("ilk sayiyi giriniz: ");
	            sayi1=inp.nextInt();
	            System.out.print("ikinci sayiyi giriniz: ");
	            sayi2=inp.nextInt();
	            cıkar(sayi1,sayi2);
	            System.out.print("Baska bir islem yapmak icin 1'e cıkıs yapmak icin 0 a basınız ");
	            select2=inp.nextInt();
	            if(select2 == 0)
	            {
	                select=0;
	            }
	            break;
	            
	            case 3:
	            System.out.print("ilk sayiyi giriniz: ");
	            sayi1=inp.nextInt();
	            System.out.print("ikinci sayiyi giriniz: ");
	            sayi2=inp.nextInt();     
	            carp(sayi1,sayi2);
	            System.out.print("Baska bir islem yapmak icin 1'e cıkıs yapmak icin 0 a basınız ");
	            select2=inp.nextInt();
	            if(select2 == 0)
	            {
	                select=0;
	            }
	            break;
	            
	            case 4:
	            System.out.print("ilk sayiyi giriniz: ");
	            sayi=inp.nextInt();
	            System.out.print("ikinci sayiyi giriniz: ");
	            sayii=inp.nextInt();
	            bol(sayi,sayii);
	            System.out.print("Baska bir islem yapmak icin 1'e cıkıs yapmak icin 0 a basınız ");
	            select2=inp.nextInt();
	            if(select2 == 0)
	            {
	                select=0;
	            }
	            break;
	            
	            case 5:
	            System.out.print("ilk sayiyi giriniz: ");
	            sayi1=inp.nextInt();
	            System.out.print("ikinci sayiyi giriniz: ");
	            sayi2=inp.nextInt();
	            uslu(sayi1,sayi2);
	            System.out.print("Baska bir islem yapmak icin 1'e cıkıs yapmak icin 0 a basınız ");
	            select2=inp.nextInt();
	            if(select2 == 0)
	            {
	                select=0;
	            }
	            break;
	            
	            case 6:
	            System.out.print(" sayiyi giriniz: ");
	            sayi1=inp.nextInt();
	            fakt(sayi1);
	            System.out.print("Baska bir islem yapmak icin 1'e cıkıs yapmak icin 0 a basınız ");
	            select2=inp.nextInt();
	            if(select2 == 0)
	            {
	                select=0;
	            }
	            break;
	            
	            case 7:
	            System.out.print("ilk sayiyi giriniz: ");
	            sayi1=inp.nextInt();
	            System.out.print("ikinci sayiyi giriniz: ");
	            sayi2=inp.nextInt();
	            mod(sayi1,sayi2);
	            System.out.print("Baska bir islem yapmak icin 1'e cıkıs yapmak icin 0 a basınız ");
	            select2=inp.nextInt();
	            if(select2 == 0)
	            {
	                select=0;
	            }
	            break;
	            
	            
	            case 8:
	           System.out.print("ilk kenarı giriniz: ");
	            sayi1=inp.nextInt();
	            System.out.print("ikinci kenarı giriniz: ");
	            sayi2=inp.nextInt();
	            alan(sayi1,sayi2);
	            System.out.print("Baska bir islem yapmak icin 1'e cıkıs yapmak icin 0 a basınız ");
	            select2=inp.nextInt();
	            if(select2 == 0)
	            {
	                select=0;
	            }
	            break;
	            
	            case 0:
	            break;
	            
	            default:
	            System.out.println("yanlis deger girdiniz");
	        }
	    }
	    while(select != 0);
	    
	}
}