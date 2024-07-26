package com.graymatter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("hello......");
		
		Connection con = null;
		PreparedStatement ps=null;
		DataSource ds= new DataSource();
		
		try {
			con=ds.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String email=request.getParameter("email");
		String uid=request.getParameter("uid");
		String mobile=request.getParameter("mobile");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String query="insert into user values(?,?,?,?,?)";
		
		try {
			ps=con.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ps.setString(1, uname);
			ps.setInt(2, Integer.parseInt(uid));
			ps.setString(3, email);
			ps.setString(4, pwd);
			ps.setString(5, mobile);
			
			ps.executeUpdate();
		} catch (NumberFormatException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("data inserted");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("loginpage.jsp");
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
