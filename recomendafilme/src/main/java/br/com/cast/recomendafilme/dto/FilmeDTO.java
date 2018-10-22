package br.com.cast.recomendafilme.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FilmeDTO {
	
	@JsonProperty("imdbID")
	private String imdbid;
	@JsonProperty("Title")
	private String title;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("Year")
	private String year;
	@JsonProperty("Poster")
	private String poster;
	
	@JsonProperty("Ratings")
	private List<RatingDTO> ratings;
	

	public String getImdbid() {
		return imdbid;
	}
	public void setImdbid(String imdbid) {
		this.imdbid = imdbid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public List<RatingDTO> getRatings() {
		return ratings;
	}
	public void setRatings(List<RatingDTO> ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "FilmeDTO [imdbid=" + imdbid + ", title=" + title + ", type=" + type + ", year=" + year + ", poster="
				+ poster + ", ratings=" + ratings + "]";
	}
	
	
}
