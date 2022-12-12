package com.shamily;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {
	
private static Connection getConnection() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Loaded");
	Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj","mysql_demo_tnj", "Ebrain@20");
	System.out.println(connection);
	return connection;
}
/*public static void main(String[] args) throws ClassNotFoundException, SQLException {

	User user = new User();
	user.setFirstName("Shamily");
	user.setLastName("Tamilselvan");
	user.setEmailId("shamily@gmail.com");
	user.setPhoneNo(9845562312d);
	user.setCity("Thanjavur");
	//Database.saveUser(user);
	List<User> userList = Database.getAll();
	for(User us: userList)
	{
		System.out.println("FirstName:"+us.getFirstName());
		System.out.println("LastName:"+us.getLastName());
		System.out.println("EmailId:"+us.getEmailId());
		System.out.println("PhoneNo:"+us.getPhoneNo());
		System.out.println("City:"+us.getCity());
	}
	
	
}*/
	
public static void saveUser(User user) throws ClassNotFoundException, SQLException	
{
	Connection connection = getConnection();
	System.out.println("Connected");
	String insertQuery = "insert into tb_shamily_user(firstname,lastname,email_id,phone_no,city) values(?,?,?,?,?)";
	PreparedStatement ps = connection.prepareStatement(insertQuery);
	ps.setString(1, user.getFirstName());
	ps.setString(2, user.getLastName());
	ps.setString(3, user.getEmailId());
	ps.setDouble(4, user.getPhoneNo());
	ps.setString(5, user.getCity());
	ps.executeUpdate();
	System.out.println("Insert Query run");
	ps.close();
	connection.close();
}
	


/*static void save(User user)
{
	
userObj.add(user);

}*/


public static List<User> getAll() throws ClassNotFoundException, SQLException {
	
	Connection connection = getConnection();
	String insertQuery = "select firstname,lastname,email_id,phone_no,city from tb_shamily_user	";
	PreparedStatement ps = connection.prepareStatement(insertQuery);
	ResultSet rs = ps.executeQuery();
	System.out.println("Select Query run");
	List<User> userObj = new ArrayList<User>();
	User user = null;
	while(rs.next())
	{
	user= new User();
	user.setFirstName(rs.getString(1));
	user.setLastName(rs.getString(2));
	user.setEmailId(rs.getString(3));
	user.setPhoneNo(rs.getDouble(4));
	user.setCity(rs.getString(5));
	userObj.add(user);
	
	}

	ps.close();
	connection.close();
	
	return userObj;
	
}

public static User get(UUID id) {
	
	User userObject = null;
	
	/*for (User user : userObj) {
		
		if(user.getUuid().equals(id)) {
			
			userObject = user;
			break;
		}
	}*/
	return userObject;
}
}
