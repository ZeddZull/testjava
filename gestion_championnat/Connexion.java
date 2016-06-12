import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connexion {
	Connection mysql=null;
    boolean connecte=false;
	public Connexion(String nomServeur, String nomBase, String nomLogin, String motDePasse) {
		try{
			// Class.forName("com.mysql.jdbc.Driver");
			// mysql = DriverManager.getConnection("jdbc:mysql://" + nomServeur + '/' + nomBase,nomLogin,motDePasse); // marche a l'IUT normalement
			mysql = DriverManager.getConnection(
        "jdbc:mysql://"+nomServeur+"/"+nomBase, 
        nomLogin, 
        motDePasse);
		} catch (SQLException ex1){
			System.out.println("Msg : " + ex1.getMessage() + ex1.getErrorCode());
		}// catch (ClassNotFoundException ex2){
		// 	System.out.println("Msg : " + ex2.getMessage());
		// }
		connecte = true;
	}
}