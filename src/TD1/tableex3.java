package TD1;
import java.util.Scanner;
public class tableex3 {



        public static void main(String[] args) {
            Scanner saida =new Scanner(System.in);
            System.out.println("donnar un seuil");
            double seuil=saida.nextDouble() ;
            double [] tableau =new double [10] ;
            System.out.println(" entre les elements d un tableau");
            for(int i=0 ; i<10; i++ ) {
                tableau [i]=saida.nextDouble () ;
            }
            int n=0;
            for(int i=0 ; i<10; i++ )
            {if(tableau [i] > seuil)
                n++ ;
            }

            System.out.println(" nbre des etiant qui ont n moyenne superieur seuil  " + n);

        }

    }
