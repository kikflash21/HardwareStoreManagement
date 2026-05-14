package quincaillerie;

// TODO Question 2: Ecrire la classe PieceDeBase.

public class PieceDeBase extends Piece{

    protected double prix;
    protected int dureeGarantie;
    protected int dureeFabrication;

    public PieceDeBase(String nom, String reference, double prix, int dureeGarantie, int dureeFabrication){
        super(nom, reference);
        if (prix >= 0){
            this.prix = prix;
        }
        if (dureeGarantie >= 0){
            this.dureeGarantie = dureeGarantie;
        }
        if (dureeFabrication >= 0){
            this.dureeFabrication = dureeFabrication;
        }
        setReference(reference);
    }

  
    protected void setReference(String reference){
        //this.reference = String.format("%06d", Integer.parseInt(reference));
        if (reference.length() != 6){
            this.reference = "00" + reference;
        }
        
    }

    public void affiche(){
        System.out.println("nom : " + this.nom);
        System.out.println("référence : " + this.reference);
        System.out.println(String.format("prix : %.1f euros", this.prix));
        System.out.println("garantie : " + this.dureeGarantie + " mois");
        System.out.println("durée de fabrication : " + this.dureeFabrication + " jour(s)");
        System.out.println(); 
    }

    public double prix(){
        return this.prix;
    }

    public int dureeGarantie(){
        return dureeGarantie;
    }

    public int dureeGarantieDeBase(){
        return dureeGarantie;
    }

    public int dureeFabrication(){
        return dureeFabrication;
    }

}
