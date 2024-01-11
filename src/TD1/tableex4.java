package TD1;
import java.util.Random;
public class tableex4 {




        public static void main(String[] args) {
            Random random =new Random();
            System.out.println("donnar nbre ligne et colonne");
            int ligne=3, colonne =3;
            int [][] matrice1 =new int [ligne] [colonne];
            int [][] matrice2 =new int [ligne] [colonne];
            int [][] somme=new int [ligne] [colonne];

            for(int i=0;i<ligne;i++) {
                for(int j=0;j<colonne;j++) {

                    matrice1 [i] [j]=random.nextInt(5);
                    matrice2 [i] [j]=random.nextInt(5);
                }
            }
            System.out.println("matrice 1");
            for(int i=0;i<ligne;i++) {
                for(int j=0;j<colonne;j++) {
                    System.out.print(matrice1 [i] [j]+" ");

                }
                System.out.println();
            }
            System.out.println("matrice 2");
            for(int i=0;i<ligne;i++) {
                for(int j=0;j<colonne;j++) {
                    System.out.print(matrice2 [i] [j]+" ");

                }
                System.out.println();
            }
            for(int i=0;i<ligne;i++) {
                for(int j=0;j<colonne;j++) {
                    somme [i][j]=matrice1 [i] [j] + matrice2 [i] [j];
                }

            }
            System.out.println("matrice somme");
            for(int i=0;i<ligne;i++) {
                for(int j=0;j<colonne;j++) {
                    System.out.print(somme [i] [j]+" ");

                } System.out.println();
            }
        }}


