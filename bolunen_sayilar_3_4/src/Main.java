import java.util.Scanner;
public class Main
        {
public static void main(String[] args) {
        int sum=0,numW,numR ,i=0;
        double ort=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        numW =inp.nextInt();
        for(int j=1; j<numW ; j++)
        {
        if(j %12 ==0)
        {
        sum +=j;
        i++;

        System.out.println("i:"+ i);
        }

        }
        ort=sum/i;
        System.out.println("3 ve 4 e tam bolunen sayilarin ortalaması: " + ort);
        }
        }