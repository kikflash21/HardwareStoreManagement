package quincaillerie;

import clients.Civilite;
import clients.Entreprise;
import clients.Particulier;

public class Quincaillerie {

    public static void main(String[] args) {
    /* TODO Question 3: Afficher les caractéristiques de pneu, chambre à air e, disque de jante et rayon
 Question 6: Afficher les fiches caractéristiques des 2 piièces composites jantes en kit et brouette en kit décrites dans l'énoncé.
 Question 14: Afficher les fiches caractéristiques des 2 piièces composites jantes montée et brouette montée décrites dans l'énoncé.
 Question 27: Ajouter un client particulier et une entreprise et afficher le résultat.*/

    	System.out.println("Test PieceDeBase");
    	System.out.println(" ");
        PieceDeBase pneu = new PieceDeBase("pneu", "4741", 12.5, 60, 2);
        PieceDeBase chambre = new PieceDeBase("chambre à air", "4565", 4, 20, 2);
        PieceDeBase disque = new PieceDeBase("disque de jante", "1214", 4.5, 60, 2);
        PieceDeBase rayon = new PieceDeBase("rayon", "4748", 1, 20, 1);
        pneu.affiche();
        chambre.affiche();
        disque.affiche();
        rayon.affiche();
        
    	System.out.println(pneu);
    	
    	/*System.out.println(" ");
    	System.out.println("Test PieceCompositeEnKit");
    	System.out.println(" ");
    	PieceCompositeEnKit janteKit = new PieceCompositeEnKit("jante en kit", "4541", 10);
    	janteKit.ajoute(disque);
    	janteKit.ajoute(rayon);
    	janteKit.ajoute(rayon);
    	janteKit.ajoute(rayon);
    	PieceCompositeEnKit roueKit = new PieceCompositeEnKit("roue de brouette en kit", "1512", 15);
    	roueKit.ajoute(pneu);
    	roueKit.ajoute(chambre);
    	roueKit.ajoute(janteKit);

    	
    	janteKit.affiche();
    	roueKit.affiche();
    	
    	System.out.println(" ");
    	System.out.println("Test PieceCompositeMontee");
    	System.out.println(" ");
    	PieceCompositeMontee jante = new PieceCompositeMontee("jante", "4541", 1, 7);
    	jante.ajoute(disque);
    	jante.ajoute(rayon);
    	jante.ajoute(rayon);
    	jante.ajoute(rayon);
    	PieceCompositeMontee roue = new PieceCompositeMontee("roue de brouette", "1512", 1, 8);
    	roue.ajoute(pneu);
    	roue.ajoute(chambre);
    	roue.ajoute(jante);
    	
    	jante.affiche();
    	roue.affiche();
    	
    	System.out.println(" ");
    	System.out.println("Test Catalogue");
    	System.out.println(" ");
    	
    	Catalogue cat = new Catalogue();
    	cat.ajoute(pneu);
    	cat.ajoute(chambre);
    	cat.ajoute(disque);
    	cat.ajoute(rayon);
    	cat.ajoute(janteKit);
    	cat.ajoute(roueKit);
    	cat.ajoute(jante);
    	cat.ajoute(roue);
    	System.out.println(cat);
    	cat.affichePiece("roue de brouette en kit", "011512");
    	
    	cat.ajoute(pneu);
    	
    	System.out.println(" ");
    	System.out.println("Test Clients");
    	System.out.println(" ");
    	
    	Particulier part = new Particulier("KIKA", "38100", "kika@gmail.com", "Burhan", Civilite.M);
        Entreprise entr = new Entreprise("Distri", "97600", "distri@free.fr", "siret000");

        System.out.println(part);
        System.out.println(entr);*/
    }

    
}
