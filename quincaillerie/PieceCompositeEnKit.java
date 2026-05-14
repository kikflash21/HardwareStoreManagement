package quincaillerie;

// TODO Question 5: écrire la classe PieceCompositeEnKit.
// 
public class PieceCompositeEnKit extends PieceComposite{
	
	protected int dureeMontage;
	
	public PieceCompositeEnKit(String nom, String reference, int dureeMontage){
		super(nom, reference);
        if (dureeMontage >= 0){
           this.dureeMontage = dureeMontage;
        }
		this.setReference(reference);
	}
	
	protected void setReference(String reference){
        if (!reference.startsWith("01")) {
            this.reference = "01" + reference;
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
        return tot;
    }

    public int dureeGarantie(){
    	/*int gar = super.dureeGarantieDeBase();
    	boolean deja = false;
    	 for(Piece p : super.liste) {
    		 if (p.reference.charAt(1) == '1' && p.dureeGarantie() == gar) {
    			 deja = true;
    		 }
    	 }
    	 if (!deja) {
    		 gar = gar/2;
    	 }
    	return gar;*/
    	return super.dureeGarantieDeBase()/2;
    }
    
   
	
    public void affiche(){
        System.out.println("nom : " + this.nom);
        System.out.println("référence : " + this.reference);
        System.out.println(String.format("prix : %.1f euros", this.prix()));
        System.out.println("garantie : " + this.dureeGarantie() + " mois");
        System.out.println("durée de fabrication : " + this.dureeFabrication() + " jour(s)");
        System.out.println("durée de montage particulier : " + this.dureeMontage + " mn");
        System.out.println("composants :");
        for(Piece p : super.liste) {
        	System.out.println("   " + p);
        }
        System.out.println(" ");
        
    }

	
}
