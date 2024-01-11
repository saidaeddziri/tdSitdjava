package TD1;
import java.util.Scanner;
public class boucleex3 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int max = Integer.MIN_VALUE, n,p=0;
            System.out.println("entrer un nobre");
            for (int i = 1; i <= 10; i++) {
                n = scanner.nextInt();
                if (n>max) {
                    max = n;
                    p=i;
                }
            }
            System.out.println("Max = " + max + "sao position "+p);

        }

    }
