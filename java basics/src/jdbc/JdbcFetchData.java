package jdbc;

import java.sql.*;


public class JdbcFetchData {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/practice";
		String User = "root";
		String Password = "1992";
		String query = "select FIRSTNAME from person where ID=12345";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,User,Password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("FIRSTNAME");
		System.out.println(name);
		st.close();
		con.close();

	}

}
