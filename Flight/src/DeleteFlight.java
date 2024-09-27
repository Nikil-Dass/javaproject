import java.sql.*;
public class DeleteFlight {
	public void Flightdelete() throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/flight";
		 String username ="root";
		 String password="Nikil@12";
		 String Query ="delete from det where flight_id = 6E-103";
		 Connection con =DriverManager.getConnection(url, username, password);
		 PreparedStatement pst = con.prepareStatement(Query);
		 pst.executeUpdate();
		 con.close();
		 
	}
	public static void main(String[]args) throws Exception{
	DeleteFlight ab = new DeleteFlight();
	ab.Flightdelete();
	}

}

