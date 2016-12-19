package bean;

public class FilmShow {
	
	public FilmShow() {
		// TODO Auto-generated constructor stub
	}

	private int film_id;
	private String title;
	private String description;
	private String language;
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public FilmShow(int film_id, String title, String description, String language) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.language = language;
	}
	
	
}
