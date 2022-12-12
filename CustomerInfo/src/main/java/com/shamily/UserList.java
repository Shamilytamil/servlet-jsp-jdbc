package com.shamily;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserList
 */
@WebServlet("/UserList")
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("UserList get Method Invoked");
		List<User> userList = null;
	
			
				try {
					userList = Database.getAll();
					for(User us:userList)
					{
						System.out.println("FirstName:"+us.getFirstName());
						System.out.println("LastName:"+us.getLastName());
						System.out.println("EmailId:"+us.getEmailId());
						System.out.println("PhoneNo:"+us.getPhoneNo());
						System.out.println("City:"+us.getCity());
						
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	
		request.setAttribute("users", userList);
		request.getRequestDispatcher("UserDisplay.jsp").include(request,response);
		
	}
	/*public static void main(String[] args) {
		List<User> userList2 = null;
		
		
		try {
			userList2 = Database.getAll();
			for(User us:userList2)
			{
				System.out.println("FirstName:"+us.getFirstName());
				System.out.println("LastName:"+us.getLastName());
				System.out.println("EmailId:"+us.getEmailId());
				System.out.println("PhoneNo:"+us.getPhoneNo());
				System.out.println("City:"+us.getCity());
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
