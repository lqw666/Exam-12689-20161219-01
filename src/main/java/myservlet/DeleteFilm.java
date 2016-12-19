package myservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DatabaseConn;

/**
 * Servlet implementation class DeleteFilm
 */
public class DeleteFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFilm() {
        super();
        // TODO Auto-generated constructor stub
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
		Connection con=new DatabaseConn().getConnection();
		int id=Integer.valueOf(request.getParameter("id"));
		System.err.println(id);
		String sql="delete from film where film_id = ?";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setInt(1, id);
			if(pre.execute()){
				RequestDispatcher dispaster=request.getRequestDispatcher("success.jsp");
			    dispaster.forward(request, response);
			}else{
				RequestDispatcher dispaster=request.getRequestDispatcher("fial.jsp");
		    dispaster.forward(request, response);
			}
		} catch (SQLException e) {
		}
	}

}
