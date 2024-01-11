package TD2;

public class Banque {
    public static void main(String[] args) {
        Banque N1=new Banque(5000,1200, "Q3597");
        System.out.println(N1.toString());
        System.out.println(N1.deposer(50));
        System.out.println(N1.toString());
        System.out.println(N1.retirer(200));
        System.out.println(N1.toString());
    }



    int NCompte;
    float solde;
    String CIN;

    public Banque(int NCompte,float solde,String CIN) {
        this.NCompte=NCompte;
        this.solde=solde;
        this.CIN=CIN;
    }
    public String toString() {
        return "numero de copmte : "+NCompte+"CIN :"+CIN+"son solde = "+solde;
    }
    public double deposer(double somme) {
       return solde +=somme;

    }
    public boolean retirer(double somme){
        if((solde - somme)>= 0) {
            solde -= somme;
            return  true;
        }
        return false;
    }

}
