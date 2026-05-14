package quincaillerie;

// Question 1: Ecrire la classe Piece.
public abstract class Piece{
    protected String nom;
    protected String reference;

    public Piece(String nom, String reference) {
        this.nom = nom;	
        this.reference = reference;
    }

    public String toString(){
        return this.nom + " - " + this.reference;
    }

    protected abstract void setReference(String reference);

    public abstract void affiche();

    public abstract double prix();

    public abstract int dureeGarantie();

    public abstract int dureeGarantieDeBase();

    public abstract int dureeFabrication();

    

}