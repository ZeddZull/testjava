import java.sql.Date;

public class Joueur{
// Classe permettant de manipuler les joueurs dans l'application.
	private int id;
	private int numLic;
	private String nom;
	private String prenom;
	private Date naissance;
	private int idEquipe;
	private String role;
	private int numero;

	Joueur(int id,int numLic,String nom,String prenom,Date naissance, int idEquipe, String role,int numero){
		this.id = id;
		this.numLic = numLic;
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		this.idEquipe = idEquipe;
		this.role = role;
		this.numero = numero;
	}
}