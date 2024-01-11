package TD3.ex4;

public class Batiment {
    private int adresse;
     public Batiment(){

     }
    public Batiment(int adresse){
         this.adresse=adresse;
    }

    public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }
    public String toString(){
         return "l adresse est  "+adresse;
    }
}
