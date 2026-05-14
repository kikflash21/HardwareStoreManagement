package quincaillerie;

import java.util.ArrayList;

// TODO Questions 21: écrire la classe PieceCompositeEnMontee.
// 
public class Catalogue {
	
	protected ArrayList<Piece> liste;
	
	public Catalogue() {
		liste = new ArrayList<Piece>();
	}
	
	private boolean estPresente(Piece p) {
		int i = 0;
		while (i < liste.size() && (!liste.get(i).nom.equals(p.nom) || !liste.get(i).reference.equals(p.reference))) {
			i++;
		}
		return !(i == liste.size());
	}
	
	public void ajoute(Piece p) {
		if (estPresente(p)) {
			System.out.println("Piece : " + p + " déja présente dans le catalogue");
		}
		else {
			liste.add(p);
		}
		
	}
	
	public String toString() {
		String res = "";
		for(Piece p : liste) {
			res += p.nom;
			res += " - ";
		}
		return res;
	}
	
	public void affichePiece(String nom, String reference) {
		int i = 0;
		while (i < liste.size() && (!liste.get(i).nom.equals(nom) || !liste.get(i).reference.equals(reference))) {
			i++;
		}
		if (i == liste.size()) {
			System.out.println("Piece : " + nom + " - " + reference + " absente du cataloque");
		}
		else {
			Piece p = liste.get(i);
			p.affiche();
		}
		
	}
	
}
