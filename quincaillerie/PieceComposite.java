package quincaillerie;

import java.util.ArrayList;

// TODO Question 4: écrire la classe PieceComposite.
// 

public abstract class PieceComposite extends Piece{
	
	protected ArrayList<Piece> liste;
	
	public PieceComposite(String nom, String reference){
		super(nom, reference);
		liste = new ArrayList<Piece>();
	}
	
	 
	
	public void ajoute(Piece p) {
		liste.add(p);
	}
	
	public String toString(){
		String res = this.nom + " - " + this.reference;
		for(Piece p : liste) {
			res += "\n      "  +  p.toString();
		}
		
        return res;
    }
	
	public int dureeGarantieDeBase(){
    	int min = liste.get(0).dureeGarantieDeBase();
    	for(Piece p : liste) {
    		if (p.dureeGarantieDeBase() < min) {
    			min = p.dureeGarantieDeBase();
    		}
    	}
        return min;
    }
	
    public int dureeFabrication(){
    	int max = liste.get(0).dureeFabrication();
    	for(Piece p : liste) {
    		if (p.dureeFabrication() > max) {
    			max = p.dureeFabrication();
    		}
    	}
        return max;
    }
	
	
}
