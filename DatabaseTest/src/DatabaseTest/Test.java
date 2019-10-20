package DatabaseTest;

import java.sql.*;

public class Test {

	public static void sqlserverTest()
    {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//加载驱动JDBC
			String url = "jdbc:sqlserver://localhost:1433;database=jdbc";//数据库链接地址
			String user = "sa";
			String password = "123456";
			Connection con = DriverManager.getConnection(url, user, password);//连接数据库
			
			Statement statement = con.createStatement();
			
			statement.execute("INSERT INTO usersinfo VALUES('彭世亮')");//增
			
			statement.execute("DELETE usersinfo WHERE username = '彭世亮'");//删
			
			statement.execute("UPDATE usersinfo SET username = '孙华忠' WHERE username = '彭世亮'");//改
			
			ResultSet re = statement.executeQuery("SELECT * FROM usersinfo");//执行查询语句，接收结果集
			
			while (re.next()) {//有数据就会循环打印
				System.out.println(re.getString("username"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
	
	
	public static void main(String[] args) throws SQLException {
		
		sqlserverTest();
		
	}

}
