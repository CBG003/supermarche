package supermarche;

public class Vetement extends Article implements Promotion  {

	private String couleur;
	private String taille ;
	
	public Vetement(long ref, String lib, double p, int q, String couleur, String taille) {
		super(ref, lib, p, q);
		this.couleur = couleur;
		this.taille = taille;
	}
	
	@Override
	public void decrire() {
		System.out.println(" Type : "+this.getClass().getSimpleName()+" , La couleur :" + this.getCouleur() + " , La taille : "+ this.getTaille());
	}
	
	@Override 
	public double prixDeVente(String dateStr) {
		double r = this.prixHT;
		if(estPeriodePromo(dateStr)) {
			r *=0.7;
		}
		return r;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	@Override
	double calculPrixTTC() {
		return this.prixHT * (1 + TVA);
	}

	
	
	
}
