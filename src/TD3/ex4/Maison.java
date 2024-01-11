package TD3.ex4;

public class Maison extends Batiment{
     private int nbrChambre;
    public Maison(int nbrChambre) {
        super();
        this.nbrChambre = nbrChambre;
    }
    public Maison(int adresse,int nbrChambre){
        super(adresse);
        this.nbrChambre=nbrChambre;
    }

    public int getNbrChambre() {
        return nbrChambre;
    }

    public void setNbrChambre(int nbrChambre) {
        this.nbrChambre = nbrChambre;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbrChambre=" + nbrChambre +
                '}';
    }
}
