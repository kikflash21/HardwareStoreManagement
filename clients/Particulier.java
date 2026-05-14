package clients;

// TODO Question 26: écrire la classe Particulier.
//
public class Particulier extends Client{
    protected String prenom;
    protected Civilite civilite; 

    public Particulier(String nom, String addressePostale, String adresseEletronique, String prenom, Civilite civilite){
        super(nom, addressePostale, adresseEletronique);
        this.prenom = prenom;
        this.civilite = civilite;
    }

    public String toString(){
        return civilite + " " + prenom + " " + this.nom;
    }
}
