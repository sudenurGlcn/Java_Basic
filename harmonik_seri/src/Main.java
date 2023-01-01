import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int num,i;
        double total=0.0;
        Scanner inp = new Scanner(System.in);
        System.out.print("sayiyi giriniz: ");
        num=inp.nextInt();
        for(i=1;i<=num;i++)
        {
            total+=(1.0/i);
        }

        System.out.println("sayinin basamak toplamı: " + total);
    }
}