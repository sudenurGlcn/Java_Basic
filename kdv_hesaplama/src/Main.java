import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        double para;
        Scanner input = new Scanner(System.in);
        System.out.print("para tuturaını giriniz:");
        para = input.nextDouble();
        double kdv;
        kdv=(para*18)/100;
        double tutar;
        tutar=para+kdv;
        System.out.println("para: " + para);
        System.out.println("kdv: " + kdv);
        System.out.println("tutar: " + tutar);

    }
}