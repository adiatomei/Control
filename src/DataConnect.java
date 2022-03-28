import java.sql.*;

public class DataConnect {
	DataConnect() throws Exception {
		String url = "jdbc:mysql://localhost:3306/data_port";
		String userName = "root";
		String pass = "Dumnezeu123";
		String query = "SELECT * FROM demo";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		String name = rs.getString("name");
		System.out.println(name);
		
		st.close();
		con.close();
		

	}
}
