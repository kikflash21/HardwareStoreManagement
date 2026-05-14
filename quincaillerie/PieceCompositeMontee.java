package quincaillerie;

// TODO Question 13: écrire la classe PieceCompositeEnMontee.
// 
public class PieceCompositeMontee extends PieceComposite{
	
	protected int dureeMontage;
	protected double prixMontage;
	
	public PieceCompositeMontee(String nom, String reference, int dureeMontage, double prixMontage){
		super(nom, reference);
        if (dureeMontage >= 0){
           this.dureeMontage = dureeMontage;
        }
        if (prixMontage >= 0){
           this.prixMontage = prixMontage;
        }
		setReference(reference);
	}
	

    protected void setReference(String reference){
        if (!reference.startsWith("02")) {
            this.reference = "02" + reference;
        } 
        else {
            this.reference = reference;
        }
    }
	
	

    public double prix(){
    	double tot = 0;
    	for(Piece p : super.liste) {
    		tot += p.prix();
    	}
        return tot + this.prixMontage;
    }

    public int dureeGarantie(){
    	return this.dureeGarantieDeBase() + 6;
    }
    
    public int dureeFabrication(){
    	int max = liste.get(0).dureeFabrication();
    	for(Piece p : liste) {
    		if (p.dureeFabrication() > max) {
    			max = p.dureeFabrication();
    		}
    	}
        return max + this.dureeMontage;
    }
	
    public void affiche(){
        System.out.println("nom : " + this.nom);
        System.out.println("référence : " + this.reference);
        System.out.println(String.format("prix : %.1f euros", this.prix()));
        System.out.println("garantie : " + this.dureeGarantie() + " mois");
        System.out.println("durée de fabrication : " + this.dureeFabrication() + " jour(s)");
        System.out.println("durée de montage atelier : " + this.dureeMontage + " jour(s)");
        System.out.println(String.format("prix du montage : %.1f euros", this.prixMontage));
        System.out.println("composants :");
        for(Piece p : super.liste) {
        	System.out.println("   " + p);
        }
        System.out.println(" ");
        
    }
}
