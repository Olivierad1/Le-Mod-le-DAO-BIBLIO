package metier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpruntArchive {
	
	/** Attribut de la date d'emprunt d'un exemplaire*/
	private Date dateEmprunt;
	/** format de la date d'emprunt*/
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	/** Attribut de la date de restitution  d'un exemplaire*/
	private Date dateRestitutionEFF;
	/** format de la date d'emprunt*/
	private static SimpleDateFormat eff = new SimpleDateFormat("dd/MM/yyyy");
	
	/** Attribut qui retourne l'utilisateur qui a emprunte*/
	Utilisateur u;
	/**Attribut qui retourne l'exemplaire qui a été emprunté*/
	Exemplaire ex;
	
	/** Attribut qui retourne l'utilisateur dont l'emprunt a été archivé */
	Utilisateur a;
	/**Attribut qui retourne l'exemplaire qui a été archivé*/
	Exemplaire ar;
	
	
	
	/** Constructeurs avec fields*/

	public EmpruntArchive(Date dateEmprunt, Date dateRestitutionEFF) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.dateRestitutionEFF = dateRestitutionEFF;
	}
	
	
	/** Constructeurs sans fields*/
	public EmpruntArchive() {
	}


	/** Getters and Setters */
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}


	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}


	public Date getDateRestitutionEFF() {
		return dateRestitutionEFF;
	}


	public void setDateRestitutionEFF(Date dateRestitutionEFF) {
		this.dateRestitutionEFF = dateRestitutionEFF;
	}
	
	
    /** Méthode String */
	
	@Override
	public String toString() {
		return "EmpruntArchive [dateEmprunt=" + dateEmprunt + ", dateRestitutionEFF=" + dateRestitutionEFF + ", u=" + u
				+ ", ex=" + ex + ", a=" + a + ", ar=" + ar + ", getDateEmprunt()=" + getDateEmprunt()
				+ ", getDateRestitutionEFF()=" + getDateRestitutionEFF() + ", toString()=" + super.toString() + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
