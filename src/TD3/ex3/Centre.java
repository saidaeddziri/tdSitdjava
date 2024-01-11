package TD3.ex3;

public class Centre extends Point{
    char nom;
    public Centre(int x, int y,char nom) {
        super(x, y);
        this.nom=nom;
    }
    public void affNom() {
        System.out.println("Nom : " + nom);
    }
    public void affCoordNom() {
        System.out.println("Coordonnees : " + getX() + " " + getY() + " Nom : " + nom);
    }
}
