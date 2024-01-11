package TD3.ex2;

public class PointNom extends Point{
    char nom;
    public PointNom(int x,int y,char nom ){
        super(x,y);
        this.nom=nom;
    }
    public void setNom(char nom) {
        this.nom = nom;
    }
    public void affCoordNom() {
        System.out.println("Coordonnees : " + getX() + " " + getY() + " Nom : " + nom);
    }
}
