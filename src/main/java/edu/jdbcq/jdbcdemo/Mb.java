package edu.jdbcq.jdbcdemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;
public class Mb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sai", "root", "");
						PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into customerstable values(?,?)");  
			ps.setString(1,"sonoo");  
			  
			FileInputStream fin=new FileInputStream("mb.jpg"); 
		ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
			}catch (Exception e) {e.printStackTrace();}  
			}  
			}  
	