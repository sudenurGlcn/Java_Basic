import java.util.Scanner;

public class Main {

    static int negatif(int m) {
        if (m <= 0){
            return m;
        }
        else {
            System.out.print(m+ " ");
            return negatif(m-5);
        }
    }

    static int pozitif(int m,int n) {
        if(m > n){
            return m;
        }
        else {
            System.out.print(m + " ");
            return pozitif(m+5,n);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int sayi;
            System.out.print("Sayiyi giriniz : ");
             sayi = input.nextInt();

            pozitif(negatif(sayi),sayi);


        
    }
}
