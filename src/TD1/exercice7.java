package TD1;
import java.util.Scanner;
public class exercice7 {



        public static void main(String[] args) {
            Scanner saida =new Scanner(System.in);
            System.out.println("donnar un nbre");
            int n=saida.nextInt() ;
            for(int i=1 ; i<= n ; i++)  {
                for(int j=1 ; j<= i; j++)
                    System.out.print("  " + j);

                System.out.println(" ");}
        }

    }

