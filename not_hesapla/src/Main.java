import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int fizik,mat,tarih,kimya,turkce,muzik,c=0;
        Scanner deger = new Scanner(System.in);
        System.out.print("mat notunuzu giriniz:");
        mat=deger.nextInt();
        if(mat<0 || mat>100){
            System.out.println("yanlış değer girdiniz");
            mat=0;
            c++;
        }
        System.out.print("fizik notunuzu giriniz:");
        fizik=deger.nextInt();
        if(fizik<0 || fizik>100){
            System.out.println("yanlış değer girdiniz");
            fizik=0;
            c++;
        }
        System.out.print("turkce notunuzu giriniz:");
        turkce=deger.nextInt();
        if(turkce<0 || turkce>100){
            System.out.println("yanlış değer girdiniz");
            turkce=0;
            c++;
        }
        System.out.print("kimya notunuzu giriniz:");
        kimya=deger.nextInt();
        if(kimya<0 || kimya>100){
            System.out.println("yanlış değer girdiniz");
            kimya=0;
            c++;
        }
        System.out.print("tarih notunuzu giriniz:");
        tarih=deger.nextInt();
        if(tarih<0 || tarih>100){
            System.out.println("yanlış değer girdiniz");
            tarih=0;
            c++;
        }
        System.out.print("muzik notunuzu giriniz:");
        muzik=deger.nextInt();
        if(muzik<0 || muzik>100){
            System.out.println("yanlış değer girdiniz");
            muzik=0;
            c++;
        }
        int toplam = mat+fizik+kimya+muzik+tarih+turkce;
        double sonuc = toplam/(6-c);
        System.out.println(sonuc);
        System.out.println(sonuc>55 ? "sınıfı gecti" : "sınıfta kaldı");
    }
}