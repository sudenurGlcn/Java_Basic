import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int km,yas,tip;
        double tutar,indirimliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Km: ");
        km=inp.nextInt();
        System.out.print("Yas: ");
        yas=inp.nextInt();
        System.out.print("Tek yon bilet icin 1.tip bilet ,Gidis gelis bilet almak icin 2.tip bileti seciniz");
        System.out.println("tip: ");
        tip=inp.nextInt();
        if(km>0 && yas>0 && (tip==1 || tip==2))
        {
            tutar=km*(0.10);
            if(yas<12)
            {
                tutar=(tutar/2);
            }
            else if( yas>=12 && yas<24)
            {
                tutar = tutar-((tutar*10)/100);
            }
            else if( yas>65)
            {
                tutar = tutar-((tutar*30)/100);
            }

            switch (tip) {
                case 1:
                    System.out.print("Bilet ucretiniz: " + tutar);
                    break;
                case 2:
                    indirimliTutar= tutar-((tutar*20)/100);
                    System.out.print("Bilet ucretiniz: " + (indirimliTutar)*2);
            }

        }
        else
        {
            System.out.println("Hatali tercih yaptiniz ");
        }
    }
}
