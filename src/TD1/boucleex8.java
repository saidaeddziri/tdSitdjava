package TD1;
import java.util.Scanner;
public class boucleex8 {



        public static void main(String[] args) {
            Scanner saida =new Scanner(System.in);
            System.out.println("donnar un nbre");
            int n=saida.nextInt() ;
            for(int i=1 ; i<= n ; i++)  {
                for(int j=1 ; j<= i; j++)
                    System.out.print(" * " );
                System.out.println(" ");}
            for(int k=(n-1) ; k>= 1; k--)  {
                for(int l=k; l>= 1; l--)
                    System.out.print(" * " );

                System.out.println(" ");}

        }
    }

