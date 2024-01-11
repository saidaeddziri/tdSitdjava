package TD1;
import java.util.Scanner;
public class exercice1 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez la première variable : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int b = scanner.nextInt();

        System.out.print("Entrez la troisième variable : ");
        int c= scanner.nextInt();
        int max=a;
        if(b > a) {
            if(c > b)
                max=c;
            else max=b;
        }
        if(c > a) {
            if(b > c)
                max=b;
            else max=c;
        }

        System.out.print("le max et  : "+max);

    }


}
