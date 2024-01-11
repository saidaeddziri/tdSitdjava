package TD2;

public class ex2 {
    public static void main(String[] args) {
        ex2 A =new ex2();
        A.setAbscisse(5);
        A.setOrdonnee(6);
        A.setNom('a');
        System.out.println(A.getAbscisse());
        System.out.println(A.getOrdonnee());
        System.out.println(A.getNom());

        System.out.println(A.norme());
    }


    private int abscisse,ordonnee;
        private char nom ;
        public int getAbscisse() {
            return abscisse ;
        }
        public char getNom() {
            return nom ;
        }
        public int getOrdonnee() {
            return ordonnee ;
        }


        public void setAbscisse(int abscisse) {
            this.abscisse =abscisse ;

        }
        public void setOrdonnee(int ordonnee) {
            this.ordonnee =ordonnee ;
        }
        public void setNom(char nom) {
            this.nom =nom ;
        }

        public double norme() {
            return Math.sqrt(abscisse*abscisse +ordonnee*ordonnee );
        }

    }

