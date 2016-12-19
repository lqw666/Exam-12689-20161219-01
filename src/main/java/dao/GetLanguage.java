package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import database.DatabaseConn;

public class GetLanguage {

	public  Set<String> getnames(){
		String sql="select name from language";
		Connection con=new DatabaseConn().getConnection();
		Set<String> names=new HashSet<String>();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				String name=rs.getString(1);
				names.add(name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return names;
		
	}
	
}
