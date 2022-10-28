package lab;

public class Movie {
	private String movieName,movieStartTime,movieEndTime;
	private int movieTicketPrice;
	void set_movie_name(String mn) {
		movieName=mn;
	}
	void set_movie_start(String ns) {
		movieStartTime=ns;
	}
	void set_movie_end(String me) {
		movieEndTime=me;
	}
	void set_movie_price(int p) {
		movieTicketPrice=p;
	}
	String get_movie_name() {
		return movieName;
	}
	String get_movie_start() {
		return movieStartTime;
	}
	String get_movie_end() {
		return movieEndTime;
	}
	int get_movie_price() {
		return movieTicketPrice;
	}
}
