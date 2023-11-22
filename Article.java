package supermarche;

public abstract class Article {

	protected long reference;
	protected String libelle;
	protected double prixHT;
	protected int qteStock = 0;
	protected final double TVA = 0.1;
	
	
	public Article(long ref, String lib, double p, int q) {
		this.reference = ref;
		this.libelle = lib;
		this.prixHT = p;
		this.qteStock = q;
	}
	
	public void approvisionner(int nb) {
		this.qteStock += nb;
	}
	
	public void decrire() {
		System.out.println("la référence : "+ this.reference + "et l’intitulé du article :" + this.libelle);
	}
	
	abstract double calculPrixTTC();
	
	public boolean appartientPromo() {
		return false;
	}
	
	public boolean estDispo(int qteAchat) {
		return this.qteStock >= qteAchat;
	}
	
}
