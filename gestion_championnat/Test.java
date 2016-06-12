import java.sql.SQLException;
class Test{

	public static void main(String[] args){
		Connexion co = new Connexion("localhost","Handball","root","fabien13.");
		try{
			RoleBD r = new RoleBD(co);
			System.out.println(r.getRole('J'));
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
	}
}