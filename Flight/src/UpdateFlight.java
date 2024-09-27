import java.sql.*;
public class UpdateFlight {
	public void Flightupdate() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/flight";
		 String username ="root";
		 String password="Nikil@12";
		 String Query ="update det set airplane_name='Spice_jet' where flight_id=?";
		 Connection con =DriverManager.getConnection(url, username, password);
		 PreparedStatement pst =con.prepareStatement(Query);
		 pst.setString(1, "6E-101");
	 
         pst.executeUpdate();	
         con.close();
	}
	
	public static void main(String[]args) throws Exception{
		UpdateFlight ab=new UpdateFlight();
		ab.Flightupdate();
		
	}
	}

