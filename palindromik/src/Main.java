import java.util.Scanner;

public class Main {
    static boolean isPolindrome(String str) {
        String reverse ="";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
     Scanner inp= new Scanner(System.in);
     System.out.println("Kelime giriniz: ");
     String s=inp.nextLine();
     if(isPolindrome(s)==true)
     {
         System.out.println(s + " Polindromdur.");
     }
     else
     {
         System.out.println(s+ " polindrom degildir.");
     }

    }
}