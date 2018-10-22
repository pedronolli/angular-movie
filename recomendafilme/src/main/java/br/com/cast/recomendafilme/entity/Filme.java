package br.com.cast.recomendafilme.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filme", schema="recomenda")
public class Filme {
	
	@Id
	private String imdbid;
	
	private String title;
	private String type;
	private String year;
	private String poster;
	private String source;
	private String value;
	
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
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
	
	

}
