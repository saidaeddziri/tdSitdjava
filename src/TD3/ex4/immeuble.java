package TD3.ex4;

public class immeuble extends Batiment {

    private int nbrAppart;

    public immeuble(int nbrAppart) {
        super();
        this.nbrAppart = nbrAppart;
    }

    public immeuble(int adresse, int nbrAppart) {
        super(adresse);
        this.nbrAppart = nbrAppart;
    }

    public int getNbrAppart() {
        return nbrAppart;
    }

    public void setNbrAppart(int nbrAppart) {
        this.nbrAppart = nbrAppart;
    }

    @Override
    public String toString() {
        return "immeuble{" +
                "nbrAppart=" + nbrAppart +
                '}';
    }
}

