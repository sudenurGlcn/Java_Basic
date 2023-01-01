import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int num1,num2,i,sum=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("üssü olacak sayiyi  giriniz: ");
        num1=inp.nextInt();
        System.out.print("üs olacak sayiyi giriniz: ");
        num2=inp.nextInt();
        for(i=1;i<=num2;i++)
        {
            sum *=num1;
        }
        System.out.print(num1+"^"+num2 + "=" + sum );

    }
}