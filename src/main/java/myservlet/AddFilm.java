package myservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DatabaseConn;

/**
 * Servlet implementation class handledate
 */
public class AddFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFilm() {
        super();
        // TODO Auto-generated constructor stub
    }
    public String handleString(String s){
		try{
			byte bb[]=s.getBytes("iso-8859-1");
			s=new String(bb);
		}
		catch(Exception ee){
		}
		return s;
		}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title=request.getParameter("title");
		String description=request.getParameter("description");
		String language=request.getParameter("language");
		Connection con=new DatabaseConn().getConnection();
		
		try {
			PreparedStatement pre=con.prepareStatement("select language_id from language where name = ?");
			pre.setString(1, language);
			ResultSet rs=pre.executeQuery();
			int language_id=rs.getInt(1);
			System.out.println(language_id);
			pre=con.prepareStatement("insert into film (title,description,language_id) values (?,?,?) ");
			
			pre.setString(1, title);
			pre.setString(2, description);
			pre.setInt(3, language_id);
			
			if(pre.executeUpdate()>0){
				pre=con.prepareStatement("insert into language (language_id,name) values(?,?)");
				pre.setInt(1, language_id);
				pre.setString(2, request.getParameter(language));
				if(pre.executeUpdate()>0){
					RequestDispatcher dispaster=request.getRequestDispatcher("success.jsp");
				    dispaster.forward(request, response);
				}else{
					RequestDispatcher dispaster=request.getRequestDispatcher("fial.jsp");
				    dispaster.forward(request, response);
				}
			}else{
				RequestDispatcher dispaster=request.getRequestDispatcher("fial.jsp");
			    dispaster.forward(request, response);
			}
			
		} catch (SQLException e) {
			RequestDispatcher dispaster=request.getRequestDispatcher("fial.jsp");
		    dispaster.forward(request, response);
		}
		
	}

}
