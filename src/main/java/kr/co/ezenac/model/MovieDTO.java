package kr.co.ezenac.model;

public class MovieDTO {
	
	private String mv_number;
	private String mv_name;
	private String mv_rank;
	private String mv_poster;
	private String mv_director;
	private String mv_actor;
	private String mv_story;
	private String mv_open_date;
	private String mv_genre;
	private String mv_nationality;
	private String mv_age;
	private String mv_runningtime;
	private String mv_rate;
	int seq;
	
	public String getMv_number() {
		return mv_number;
	}
	public void setMv_number(String mv_number) {
		this.mv_number = mv_number;
	}
	public String getMv_name() {
		return mv_name;
	}
	public void setMv_name(String mv_name) {
		this.mv_name = mv_name;
	}
	public String getMv_rank() {
		return mv_rank;
	}
	public void setMv_rank(String mv_rank) {
		this.mv_rank = mv_rank;
	}
	public String getMv_poster() {
		return mv_poster;
	}
	public void setMv_poster(String mv_poster) {
		this.mv_poster = mv_poster;
	}
	public String getMv_director() {
		return mv_director;
	}
	public void setMv_director(String mv_director) {
		this.mv_director = mv_director;
	}
	public String getMv_actor() {
		return mv_actor;
	}
	public void setMv_actor(String mv_actor) {
		this.mv_actor = mv_actor;
	}
	public String getMv_story() {
		return mv_story;
	}
	public void setMv_story(String mv_story) {
		this.mv_story = mv_story;
	}
	public String getMv_open_date() {
		return mv_open_date;
	}
	public void setMv_open_date(String mv_open_date) {
		this.mv_open_date = mv_open_date;
	}
	public String getMv_genre() {
		return mv_genre;
	}
	public void setMv_genre(String mv_genre) {
		this.mv_genre = mv_genre;
	}
	public String getMv_nationality() {
		return mv_nationality;
	}
	public void setMv_nationality(String mv_nationality) {
		this.mv_nationality = mv_nationality;
	}
	public String getMv_age() {
		return mv_age;
	}
	public void setMv_age(String mv_age) {
		this.mv_age = mv_age;
	}
	public String getMv_runningtime() {
		return mv_runningtime;
	}
	public void setMv_runningtime(String mv_runningtime) {
		this.mv_runningtime = mv_runningtime;
	}
	public String getMv_rate() {
		return mv_rate;
	}
	public void setMv_rate(String mv_rate) {
		this.mv_rate = mv_rate;
	}
	public MovieDTO(String mv_number, String mv_name, String mv_rank, String mv_poster, String mv_open_date,
			String mv_age, int seq) {
		super();
		this.mv_number = mv_number;
		this.mv_name = mv_name;
		this.mv_rank = mv_rank;
		this.mv_poster = mv_poster;
		this.mv_open_date = mv_open_date;
		this.mv_age = mv_age;
		this.seq = seq;
	}
	
	
	
}
