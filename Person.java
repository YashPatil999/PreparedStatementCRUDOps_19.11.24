package JDBC_19Nov;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Person {
	public void Insert(int pId, String pName, String pAddress) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		PreparedStatement ps = conn.prepareStatement("insert into personDetails values(?,?,?)");
		ps.setInt(1, pId);
		ps.setString(2, pName);
		ps.setString(3, pAddress);

		ps.executeUpdate();

		System.out.println("Data Added Successfully....");
		conn.close();
	}

	public void Update(int pId, String pName, String pAddress) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		PreparedStatement ps = conn.prepareStatement("update personDetails set pName=?,pAddreass=? where pId=?");
		ps.setString(1, pName);
		ps.setString(2, pAddress);
		ps.setInt(3, pId);

		ps.executeUpdate();

		System.out.println("Data Updated Successfully....");
		conn.close();
	}

	public void Delete(int pId) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		PreparedStatement ps = conn.prepareStatement("delete from personDetails where pId=?");
		ps.setInt(1, pId);

		ps.executeUpdate();

		System.out.println("Data Deleted Successfully....");
		conn.close();
	}

	public void GetAllData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
		PreparedStatement ps = conn.prepareStatement("Select * from personDetails");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("PId = " + rs.getInt(1) + "\nPName = " + rs.getString(2) + "\nPAddress = "
					+ rs.getString(3) + "\n=======================");
		}
		conn.close();
	}
}
