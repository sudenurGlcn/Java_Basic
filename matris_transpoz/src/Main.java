import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int row,col;
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        row=inp.nextInt();
        System.out.print("Enter the number of columns: ");
        col=inp.nextInt();
       int matris[][]=new int[row][col];
       int temp[][]=new int[row][col];
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               System.out.print("Enter the element of row "+(i+1)+" and column "+(j+1)+": ");
               matris[i][j]=inp.nextInt();
           }
       }

       for(int i=0;i<row;i++)
         {
              for(int j=0;j<col;j++)
              {
                  temp[i][j] = matris[j][i];
              }
         }
        System.out.println("The matrix is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the matrix is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }


    }
}