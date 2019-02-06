package edu.jdbcq.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sai", "root", "");
			Statement stmt = (Statement) con.createStatement();
			ResultSet rs = stmt.executeQuery("select*FROM CUSTOMERS");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + " " + rs.getString(4)
						+ "  " + rs.getInt(5));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
