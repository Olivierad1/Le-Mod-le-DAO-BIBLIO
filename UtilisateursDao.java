package metier.dao;

import metier.Utilisateur;



public interface UtilisateursDao {
	
	     void creer( Utilisateur utilisateur ) throws DAOException;

	     Utilisateur trouver( String email ) throws DAOException ;
		      }

	
	//Tableau qui simule la Base de Données des hotels
	

