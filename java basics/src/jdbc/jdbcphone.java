package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class jdbcphone {

	public static void main(String[] args)  throws Exception{
		String url = "jdbc:mysql://localhost:3306/practice";
		String User = "root";
		String Password = "1992";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,User,Password);
		Statement st = con.createStatement();
		String query = "select ID,FIRSTNAME from person";
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String id = rs.getString("ID");
		String name = rs.getString("FIRSTNAME");
		System.out.println(id);
		System.out.println(name);
		st.close();
		con.close();
		
		// TODO Auto-generated method stub

	}

}
