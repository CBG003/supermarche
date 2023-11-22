package supermarche;



public class ProduitElec extends Article implements Promotion {
	private String categorie;

	public ProduitElec(long ref, String lib, double p, int q , String categorie) {
		super(ref, lib, p, q);
		this.setCategorie(categorie);
	}

	

	@Override
	double calculPrixTTC() {
		return this.prixHT*(1.08+TVA);
	}

	@Override
	public void decrire() {
		super.decrire();
		System.out.println("Type :" +this.getClass().getSimpleName() + ", categorie : " + this.getCategorie());
	}

	@Override
	public double prixDeVente(String dateStr) {
		double r = this.prixHT;
		if(estPeriodePromo(dateStr)) {
			r *=0.8;
		}
		return r;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		if(categorie.equalsIgnoreCase("électroménager") || categorie.equalsIgnoreCase("TV") || categorie.equalsIgnoreCase("téléphones") || categorie.equalsIgnoreCase("ordinateurs") ) {
			this.categorie = categorie;}
	}
	
	
	
	
	
}
