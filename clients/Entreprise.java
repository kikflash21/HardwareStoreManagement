package clients;

// TODO Question 27: écrire la classe Entreprise.
// 

public class Entreprise extends Client{
    protected String SIRET;

    public Entreprise(String nom, String addressePostale, String adresseEletronique, String siret){
        super(nom, addressePostale, adresseEletronique);
        this.SIRET = siret;
    }

    public String toString(){
        return "Entreprise : " + nom + " (" + SIRET + ")";
    }
}