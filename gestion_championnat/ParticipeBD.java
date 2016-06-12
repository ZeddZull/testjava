import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ParticipeBD{
// ICI on fait les requètes sur la table PARTICIPER.
	private Connexion co;
    private Statement st;

    ParticipeBD(Connexion co) throws SQLException{
    	this.co = co;
        this.st = co.mysql.createStatement();
    }
}