import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int num1,num2,totalN=1,i,sum=0,totalR=1,total=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi1'i giriniz: ");
        num1=inp.nextInt();
        System.out.print("sayi2 yi giriniz: ");
        num2=inp.nextInt();

        for(i=1;i<=num1;i++)
        {
            totalN=totalN*i;
        }

        for(i=1;i<=num2;i++)
        {
            totalR=totalR*i;
        }
        for(i=1;i<=(num1-num2);i++)
        {
            total=total*i;
        }
        sum=totalN/(totalR * total);
        System.out.println("sonuc: " + sum);
    }
}

