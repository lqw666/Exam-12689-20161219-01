package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import bean.FilmShow;
import database.DatabaseConn;

public class ShowFilms {
	
	
	public ShowFilms() {
		// TODO Auto-generated constructor stub
	}
	public Set<FilmShow> getfilms(){
		Set<FilmShow> filmset=new HashSet<FilmShow>();
		Connection con=new DatabaseConn().getConnection();
		String sql="select film_id,title,description,language.name from "
				+ "film,language where film.language_id = language.language_id";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				FilmShow filmShow=new FilmShow();
				filmShow.setFilm_id(rs.getInt(1));
				filmShow.setTitle(rs.getString(2));
				filmShow.setDescription(rs.getString(3));
				filmShow.setLanguage(rs.getString(4));
				filmset.add(filmShow);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filmset;
		
	}
}
