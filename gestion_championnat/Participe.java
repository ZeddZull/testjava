public class Participe{
// Classe permettant de manipuler les stats des joueurs dans l'application.
	private int idJ;
	private int idM;
	private int tpsJeu;
	private int tpsExp;
	private int nbButs;
	private int nbPasses;
	private int nbFautes;

	Participe(int idJ, int idM, int tpsJeu, int tpsExp, int nbButs, int nbPasses, int nbFautes){
		this.idJ = idJ;
		this.idM = idM;
		this.tpsJeu = tpsJeu;
		this.tpsExp = tpsExp;
		this.nbButs = nbButs;
		this.nbPasses = nbPasses;
		this.nbFautes = nbFautes;
	}
}