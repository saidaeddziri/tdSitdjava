package TD2;

public class Rectangle {




        public static void  main(String[] args) {
            Rectangle rectangle = new Rectangle(2,2);

            System.out.println(rectangle.perimetre());
            System.out.println(rectangle.isCarre());

        }


        private double longueur, largeur;

        public Rectangle() {
        }

        public Rectangle(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
        }

        public Rectangle(Rectangle rectangle) {
            this.longueur = rectangle.getLongueur();
            this.largeur = rectangle.getLargeur();
        }

        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            if (longueur >= 0)
                this.longueur = longueur;
            else this.longueur = 0;
        }

        public double getLargeur() {

            return largeur;
        }

        public void setLargeur(double largeur) {
            if (largeur >= 0)
                this.largeur = largeur;
            else this.largeur = 0;
        }

        public double perimetre() {
            return 2 * (this.getLargeur() + this.getLongueur());
        }

        public double aire() {
            return longueur * largeur;
        }

        public boolean isCarre() {
            if(largeur == longueur)
            return true;return false;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "longueur=" + longueur +
                    ", largeur=" + largeur ;

        }
    }
