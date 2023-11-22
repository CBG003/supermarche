package supermarche;

public class ProduitGC extends Article {

	public ProduitGC(long ref, String lib, double p, int q) {
		super(ref, lib, p, q);

	}

	@Override
	public double calculPrixTTC() {
		return this.prixHT *(1 + TVA);
	}
	
	@Override
	public void decrire() {
		super.decrire();
		System.out.println("Type :" +this.getClass().getSimpleName());
	}


}
