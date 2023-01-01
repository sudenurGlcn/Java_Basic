import java.util.Scanner;
import java.util.Arrays;
public class Main {
     static int minHesapla(int[] dizi,int sayi) {
         int minValue = 0;
        int min = Math.abs(dizi[0]-sayi);
        for (int i = 0; i < dizi.length; i++) {
            if (Math.abs((dizi[i]-sayi)) <= min) {
                min = Math.abs(dizi[i]-sayi);
                minValue = dizi[i];
            }
        }
        return minValue;
    }
    static int maxHesapla(int[] dizi,int sayi) {
        int maxValue = 0;
        int max = Math.abs(dizi[0]-sayi);
        for (int i = 0; i < dizi.length; i++) {
            if (Math.abs((dizi[i]-sayi)) >= max) {
                max = Math.abs(dizi[i]-sayi);
                maxValue = dizi[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("sayiyi giriniz:");
        int sayi=inp.nextInt();
        int [] arr={1,112,-24,-16,14,0,17,100};
        System.out.println("Dizi: "+ Arrays.toString(arr));
        System.out.println("girilen sayi: " + sayi);
        System.out.println("en yakın sayi: " + minHesapla(arr,sayi));
        System.out.println("en uzak sayi: " + maxHesapla(arr,sayi));
    }
}