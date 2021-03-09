package metier ;

import java.util.Date;

public class Adherent extends Utilisateur {
	/** Attribut du num�ro de t�l�phone de l'adh�rent*/
	private String telephone;
	/** Attribut de la dur�e max d'emprunt d'un livre*/
	private Integer dureeMaxPret = 15;
	/** Attribut du nombre de pr�t maximal autoris�*/
	private static Integer nbMaxPrets = 3;
	
	
	
	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, Integer idUtilisateur, String pwd,
			String pseudonyme, String telephone) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.telephone = telephone;
	}
	
	public Adherent(String nom, String prenom, Integer idUtilisateur, String pwd,
			String pseudonyme, String telephone) {
		super(nom, prenom, idUtilisateur, pwd, pseudonyme);
		this.telephone = telephone;
	}

	public Adherent(String nom, String prenom, String telephone) {
		super(nom, prenom);
		this.telephone = telephone;
	}
	
	public Adherent(String nom, String prenom) {
		super(nom, prenom);
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Integer getDureeMaxPret() {
		return dureeMaxPret;
	}


	public void setDureeMaxPret(Integer dureeMaxPret) {
		this.dureeMaxPret = dureeMaxPret;
	}


	public static Integer getNbMaxPrets() {
		return nbMaxPrets;
	}

	public static void setNbMaxPrets(Integer nbMaxPrets) {
		Adherent.nbMaxPrets = nbMaxPrets;
	}


	





















	@Override
	public String toString() {
		return "Adherent [nom = " + getNom() + ", prenom = " + getPrenom() + ", telephone = " + telephone + "]";
	}

	public static void main(String[] args) {
		Adherent a1 = new Adherent("Nom","Pr�nom");
		Adherent a2 = new Adherent("Nom2","Pr�nom2","00.00.00.00.00");
		System.out.println(a1 + "\n" + a2);

	}

}
