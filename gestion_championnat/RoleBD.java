import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RoleBD{
	private Connexion co;
    private Statement st;

    RoleBD(Connexion co) throws SQLException{
    	this.co = co;
        this.st = co.mysql.createStatement();
    }

    String getRole(char id) throws SQLException{
    	ResultSet rs = st.executeQuery("select nomR from Role where idR='"+id+"'");
    	if(rs.next()){
    		return rs.getString("nomR");
    	}
    		return "";
    }
}