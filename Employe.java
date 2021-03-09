package metier;

import java.util.Date;

public class Employe extends Utilisateur{
	/** Attribut du code de matricule*/
	private String codeMatricule;
	/** Attribut de la categorie de l'employ�*/
	private EnumCategorieEmploye EnumCategorieEmploye;
	
	
	
	public Employe(String nom, String prenom, Date dateNaissance, String sexe, Integer idUtilisateur, String pwd,
			String pseudonyme, String codeMatricule, metier.EnumCategorieEmploye enumCategorieEmploye) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.codeMatricule = codeMatricule;
		EnumCategorieEmploye = enumCategorieEmploye;
	}

	public Employe(String nom, String prenom, Integer idUtilisateur, String pwd,
			String pseudonyme, String codeMatricule, metier.EnumCategorieEmploye enumCategorieEmploye) {
		super(nom, prenom, idUtilisateur, pwd, pseudonyme);
		this.codeMatricule = codeMatricule;
		EnumCategorieEmploye = enumCategorieEmploye;
	}
	
	public Employe(String nom, String prenom, String codeMatricule, metier.EnumCategorieEmploye enumCategorieEmploye) {
		super(nom, prenom);
		this.codeMatricule = codeMatricule;
		EnumCategorieEmploye = enumCategorieEmploye;
	}
	
	
	public Employe(String nom, String prenom) {
		super(nom, prenom);
	
	}

	public String getCodeMatricule() {
		return codeMatricule;
	}



	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}



	public EnumCategorieEmploye getEnumCategorieEmploye() {
		return EnumCategorieEmploye;
	}



	public void setEnumCategorieEmploye(EnumCategorieEmploye enumCategorieEmploye) {
		EnumCategorieEmploye = enumCategorieEmploye;
	}

	

	@Override
	public String toString() {
		return "Employe [ nom = " + getNom() + ", prenom = " + getPrenom() +  
			", codeMatricule = " + codeMatricule + " - " + EnumCategorieEmploye + "]";
	}

	public static void main(String[] args) {


	}

}
