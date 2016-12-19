package bean;

import java.util.Date;
import java.util.Set;

public class Film {
	
	public Film() {
		// TODO Auto-generated constructor stub
	}
	
	private int film_id;
	private String title;
	private String description;
	private String release_year;
	private int language_id;
	private int original_language_id;
	private int rental_duration;
	private int replacement_cost;
	private MyEnum  rating;	
	private Set<String> special;
	private Date last_update;
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
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public int getOriginal_language_id() {
		return original_language_id;
	}
	public void setOriginal_language_id(int original_language_id) {
		this.original_language_id = original_language_id;
	}
	public int getRental_duration() {
		return rental_duration;
	}
	public void setRental_duration(int rental_duration) {
		this.rental_duration = rental_duration;
	}
	public int getReplacement_cost() {
		return replacement_cost;
	}
	public void setReplacement_cost(int replacement_cost) {
		this.replacement_cost = replacement_cost;
	}
	public MyEnum getRating() {
		return rating;
	}
	public void setRating(MyEnum rating) {
		this.rating = rating;
	}
	public Set<String> getSpecial() {
		return special;
	}
	public void setSpecial(Set<String> special) {
		this.special = special;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	public Film(int film_id, String title, String description, String release_year, int language_id,
			int original_language_id, int rental_duration, int replacement_cost, MyEnum rating, Set<String> special,
			Date last_update) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.language_id = language_id;
		this.original_language_id = original_language_id;
		this.rental_duration = rental_duration;
		this.replacement_cost = replacement_cost;
		this.rating = rating;
		this.special = special;
		this.last_update = last_update;
	}
	
}
