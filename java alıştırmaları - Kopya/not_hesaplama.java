import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int fizik,mat,tarih,kimya,turkce,muzik;
		Scanner deger = new Scanner(System.in);
	    System.out.print("mat notunuzu giriniz:");
		mat=deger.nextInt();
		System.out.print("fizik notunuzu giriniz:");
		fizik=deger.nextInt();
		System.out.print("turkce notunuzu giriniz:");
		turkce=deger.nextInt();
		System.out.print("kimya notunuzu giriniz:");
		kimya=deger.nextInt();
		System.out.print("tarih notunuzu giriniz:");
		tarih=deger.nextInt();
		System.out.print("muzik notunuzu giriniz:");
		muzik=deger.nextInt();
		int toplam = mat+ fizik+kimya+muzik+tarih+turkce;
		double sonuc = toplam/6;
		System.out.println(sonuc);
		System.out.println(sonuc>60 ? "sınıfı gecti" : "sınıfta kaldı");
	}
}