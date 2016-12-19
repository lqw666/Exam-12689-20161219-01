package myservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.coyote.Request;

import database.DatabaseConn;
import mybean.data.Login;

/**
 * Servlet implementation class helpLogin
 */
public class helpLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helpLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    public String handleString(String s)
	 {  try{byte bb[]=s.getBytes("iso-8859-1");
	      s=new String(bb);
	 }
	 catch(Exception ee){}
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
		try {
			HttpSession session=request.getSession(true);
			 Login loginBean=null;
			 try{
			    	loginBean=(Login)session.getAttribute("login");
					if(loginBean==null){
						loginBean=new Login();
						session.setAttribute("login",loginBean);
			    	}
			    }
			    catch(Exception ee){
			    	loginBean=new Login();
					session.setAttribute("login", loginBean);
			    }
			 Connection con=new DatabaseConn().getConnection();
			String sql="select * from customer where first_name = ? ";
			PreparedStatement pre=con.prepareStatement(sql);
			String name=request.getParameter("username");
			name=handleString(name);
			pre.setString(1, name);
			ResultSet rs=pre.executeQuery();
			if(rs.next()){
				loginBean.setUsername(name);
				 RequestDispatcher dispaster=request.getRequestDispatcher("main.jsp");
				    dispaster.forward(request, response);
				    
			}else{

		    	  
				RequestDispatcher dispaster=request.getRequestDispatcher("loginfail.jsp");
			    dispaster.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
