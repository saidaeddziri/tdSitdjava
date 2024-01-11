package TD2;

public class ex1 {

    public static void main(String[] args) {
        ex1 point1 =new ex1 ("a",4);
        point1.afficher();
        point1.deplacer(2);
        point1.afficher();

    }

    double abscisse;
    String nom ;

    public ex1(String nom,double abscisse) {
        this.abscisse=abscisse;
        this.nom=nom;
    }
    public  void afficher() {
        System.out.println("point est " +nom+"  son abscisse " +abscisse);
    }

    public void deplacer(double dx ) {
        abscisse +=dx ;

    }

}
