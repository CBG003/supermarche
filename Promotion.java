package supermarche;
import java.time.LocalDate;
//LocalDate	Represents a date (year, month, day (yyyy-MM-dd))

public interface Promotion {

	//représente la date de début de la promotion fixée à "19/03/2022".
	LocalDate debutPromo = LocalDate.of(2022, 03, 19);
	
	//représente la date de début de la promotion fixée à "31/03/2022".
	LocalDate finPromo = LocalDate.of(2022, 03, 31);
	
	//retourner le prix d’un article avec ou sans remise selon la date d’achat.
	double prixDeVente(String dateStr);
	
	//retourne vrai s’il s’agit bien d’une période de solde.
	default boolean estPeriodePromo(String dateStr) {
		LocalDate dp = LocalDate.parse(dateStr);
		
		/*compareTO return 0 f both the dates are equal: 
		 it returns a value "greater than 0" if date1 is after date2
		 and it returns a value "less than 0" if date1 is before date2
		 */
		return dp.compareTo(debutPromo)>=0 && dp.compareTo(finPromo)<0 ;
	}
	/*calculer la remise en pourcentage en appliquant la formule suivante : 
	 * ( prixAvantRemise - prixApresRemise) / prixAvantRemise) * 100;
	 */
	static double calculerRemise(double prixAvantRemise, double prixApresRemise) {
		return ((prixApresRemise - prixApresRemise)/prixApresRemise)*100;
	};
	
	
	
}
