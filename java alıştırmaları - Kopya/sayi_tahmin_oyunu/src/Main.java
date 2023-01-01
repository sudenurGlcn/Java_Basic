import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int tahmin;
        int randomSayi=(int)(Math.random()*100);
        int hak=5;int win=0;
        System.out.println("Sayiyi tahmin etmek icin 5 hakkiniz var.");
        System.out.println(" 1 ile 100 arasında bir sayı giriniz: ");

        while(hak>0)
        {
            tahmin=inp.nextInt();
            if(tahmin==randomSayi)
            {
                win=1;
                System.out.println("Tebrikler! Sayiyi buldunuz.");
                break;

            }
            else if(tahmin>randomSayi)
            {
                hak--;
                if(hak==0)
                {
                    System.out.println("Hakkiniz bitti. Sayiyi bulamadiniz.");
                    break;
                }
                System.out.println("Daha kucuk bir sayi giriniz. Kalan hakkiniz: "+hak);


            }
            else if(tahmin<randomSayi)
            {
                hak--;
                if(hak==0)
                {
                    System.out.println("Hakkiniz bitti. Sayiyi bulamadiniz.");
                    break;
                }
                System.out.println("Daha buyuk bir sayi giriniz. Kalan hakkiniz: "+hak);

            }
        }
        if(win==0)
        {
            System.out.println("Sayi: "+randomSayi);
        }

    }

}