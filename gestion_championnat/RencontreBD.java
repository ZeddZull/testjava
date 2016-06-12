import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RencontreBD{
// ICI on fait les requètes sur les tables RENCONTRE et ARBITRER.
	private Connexion co;
    private Statement st;

    RencontreBD(Connexion co) throws SQLException{
    	this.co = co;
        this.st = co.mysql.createStatement();
    }
}