import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestDb2 {

	public static void main(String[] args) {
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Pratyush","root","root");
			System.out.println("Connection Success");
			Statement statement = connection.createStatement(); //to run query
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter id where you want to make change : ");
			int Id = sc.nextInt();
			System.out.print("Enter Name to be updated : ");
			String Name = sc.next();
			System.out.print("Enter Address to be updated : ");
			String Address = sc.next();
			String uquery = "UPDATE `pratyush`.`student` SET `Name` = '"+Name+"', `Address` = '"+Address+"' WHERE (`Id` = '"+Id+"');"; 
			statement.executeUpdate(uquery);
			System.out.println("Data Updated");
			
			ResultSet rs = statement.executeQuery("SELECT * FROM pratyush.student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
