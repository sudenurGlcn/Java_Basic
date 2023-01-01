import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int n,i,j,k;
        Scanner inp = new Scanner(System.in);
        System.out.print("basamak sayisini giriniz: ");
        n=inp.nextInt();
        for(i=(n);i>0;i--)
        {
            for(j=0; j<=(n-i+1); j++)
            {
                System.out.print(" ");
            }
            for(k=(2*i-1);k>0;k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}