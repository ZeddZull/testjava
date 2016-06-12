import java.sql.Date;

public class Rencontre{
// Classe permettant de manipuler les rencontres (matchs) dans l'application.
	private int id;
	private Journee j;
	private Date dateM; 
	private int idLoc;
	private int nbButsLoc;
	private int idVis;
	private int nbButsVis;

	Rencontre(int id, Journee j, Date dateM, int idLoc, int nbButsLoc, int idVis, int nbButsVis){
		this.id = id;
		this.j = j;
		this.dateM = dateM;
		this.idLoc = idLoc;
		this.nbButsLoc = nbButsLoc;
		this.idVis = idVis;
		this.nbButsVis = nbButsVis;
	}
}
