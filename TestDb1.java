import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestDb1 {
	
	public static void main(String[] args) {
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Pratyush","root","root");
			System.out.println("Connection Success");
			Statement statement = connection.createStatement(); //to run query
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Id  : : ");
			int Id = sc.nextInt();
			System.out.print("Enter Name : ");
			String Name = sc.next();
			System.out.print("Enter Address : ");
		    String Address = sc.next();
			
			String query = "INSERT INTO student (`Id`, `Name`, `Address`) VALUES ('"+Id+"', '"+Name+"', '"+Address+"');";
			statement.executeUpdate(query);
			System.out.println("Data Inserted Succesfully");
			
			ResultSet rs = statement.executeQuery("SELECT * FROM pratyush.student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
