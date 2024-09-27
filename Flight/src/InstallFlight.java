import java.sql.*;
public class InstallFlight {
	public void Flightinsert() throws Exception{
		 String url ="jdbc:mysql://127.0.0.1:3306/flight";
		 String username ="root";
		 String password="Nikil@12";
		 String Query ="insert into det values(?,?,?,?,?,?)";
		 Connection con =DriverManager.getConnection(url, username, password);
		 PreparedStatement pst =con.prepareStatement(Query);
		 pst.setString(1,"6E-103");
		 pst.setString(2,"Air_India");
		 pst.setString(3, "Mumbai");
		 pst.setString(4, "Goa");
		 pst.setTimestamp(5, Timestamp.valueOf("2024-09-06 12:00:00")); 
	     pst.setTimestamp(6, Timestamp.valueOf("2024-09-07 03:00:00")); 
	     pst.executeUpdate();
	     con.close();

	}
 public static void main(String[]args) throws Exception{
	 InstallFlight ab = new InstallFlight();
	 ab.Flightinsert();
 }
}
