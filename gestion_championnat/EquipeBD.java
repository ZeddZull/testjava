import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EquipeBD{
// ICI on fait les requètes sur la table EQUIPE.
	private Connexion co;
    private Statement st;

    EquipeBD(Connexion co) throws SQLException{
    	this.co = co;
        this.st = co.mysql.createStatement();
    }
}