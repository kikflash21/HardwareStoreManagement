package clients;

// TODO Question 24: écrire la classe Client.
// 

public abstract class Client{
    protected String nom;
    protected String addressePostale;
    protected String adresseEletronique;
       

    Client(String nom, String addressePostale, String adresseEletronique){
        this.nom = nom;
        this.addressePostale = addressePostale;
        this.adresseEletronique = adresseEletronique;
    }
}