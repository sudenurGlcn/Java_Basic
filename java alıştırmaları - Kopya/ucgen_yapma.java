import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n,i,j,k;
		Scanner inp = new Scanner(System.in);
		System.out.print("basamak sayisini giriniz: ");
		n=inp.nextInt();
		for(i=0;i<n;i++)
		{
		    for(j=0; j<=(n-i); j++)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=(2*i+1);k++)
		    {
		        System.out.print("*");
		    }
		   System.out.println(" "); 
		}
		
	}
}