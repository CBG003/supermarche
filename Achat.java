package supermarche;

public class Achat {
	private static Article[]supermarche = new Article [4];
	 public static void main(String[] args) {
	        // remplir the supermarche 
	        supermarche[0] = new Vetement(123, "Jupe", 39.0, 2, "Bleu", "S");
	        supermarche[1] = new ProduitElec(145, "TV Led 80cm", 1450.0, 0, "TV");
	        supermarche[2] = new Vetement(178, "Pantalon", 42.0, 5, "Noir", "M");
	        supermarche[3] = new ProduitGC(191, "Pâtes", 0.41, 18);
	        operationAchatClient("2023-03-21");


	    }
	 
	 //methode operationAchatClient
	    public static void operationAchatClient(String dateStr) {
	        double total = 0;

	        for (int i = 0 ;i < supermarche.length ;i++) {
	            if (supermarche[i].estDispo(1)) {
	            	supermarche[i].decrire();
	                double pTTC = supermarche[i].calculPrixTTC();
	                
	                if (supermarche[i] instanceof Promotion) {
	                    pTTC = ((Promotion) supermarche[i]).prixDeVente(dateStr);
	                }

	                System.out.println("Prix TTC à payer : " + pTTC);
	                total += pTTC;
	            } else {
	                System.out.println("Article indisponible et approvisionnez-le.");

	            }
	        }

	        System.out.println("Montant total a payer : " + total);
	    }
}