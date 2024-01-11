package TD1;
import java.util.Scanner;
public class tablex1 {



        public static void main(String[] args) {
            Scanner saida =new Scanner(System.in);
            System.out.println("donnar un nbre");
            int n=saida.nextInt() ;
            int max,min;
            if((n < 10) ||( n>50)) {
                System.out.println("donner un nbre entre 10 et 50");
            }
            int [] tableau =new int [n] ;
            System.out.println(" entre les elements d un tableau");
            for(int i=0 ; i<n; i++ )
                tableau [i]=saida.nextInt() ;

            max=tableau[0] ;
            min=tableau[0] ;
            for(int i=0 ; i<n; i++ ) {
                if(tableau[i]>max)
                    max=tableau[i ];
                if(tableau[i]<min)
                    min=tableau[i ];
            }

            System.out.println("le max est  " + max);
            System.out.println("le min est  " + min);




        }

    }

