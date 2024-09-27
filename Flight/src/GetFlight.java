import java.sql.*;
public class GetFlight {
	public void Flightget() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/flight";
		 String username ="root";
		 String password="Nikil@12";
		 String Query = "select * from det";
		 Connection con =DriverManager.getConnection(url, username, password);
		 Statement smt =con.createStatement();
		 ResultSet rst = smt.executeQuery(Query);
		 while(rst.next()) {
			 System.out.println("flight_id"+"-"+rst.getString(1));
			 System.out.println("airplane_name"+"-"+rst.getString(2));
			 System.out.println("departure_city"+"-"+rst.getString(3));
			 System.out.println("destination_city "+"-"+rst.getString(4));
			 
		 }
		 con.close();
}
	 public static void main(String[]args) throws Exception{
		 GetFlight ab = new GetFlight();
		 ab.Flightget();
	 }
	}