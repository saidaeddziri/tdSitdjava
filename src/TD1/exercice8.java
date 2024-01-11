package TD1;
import java.util.Scanner;
public class exercice8 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez le numéro du mois (1 à 12) : ");
            int mois = scanner.nextInt();


            if (mois < 1 || mois > 12) {
                System.out.println("Numéro de mois invalide. Le programme se termine.");
                return;
            }


            System.out.print("Entrez l'année (1900 à 2100) : ");
            int annee = scanner.nextInt();


            if (annee < 1900 || annee > 2100) {
                System.out.println("Année invalide. Le programme se termine.");
                return;
            }


            int nombreDeJours;

            switch (mois) {
                case 1, 3, 5, 7, 8, 10, 12:
                    nombreDeJours = 31;
                    break;
                case 4, 6, 9, 11:
                    nombreDeJours = 30;
                    break;
                case 2:
                    if (annee%4==0) {
                        nombreDeJours = 29;
                    } else {
                        nombreDeJours = 28;
                    }
                    break;
                default:
                    System.out.println("Erreur inattendue. Le programme se termine.");
                    return;
            }


            System.out.println("Le mois " + mois + " de l'année " + annee + " a " + nombreDeJours + " jours.");




        }
    }


