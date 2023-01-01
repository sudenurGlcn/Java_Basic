import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int sum=0,numW;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayiyi giriniz: ");
            numW =inp.nextInt();
            if(numW %4 == 0)
            {
                sum +=numW;
            }

        }while(numW %2 == 0);

        System.out.println("toplam: " + sum);

    }
}
