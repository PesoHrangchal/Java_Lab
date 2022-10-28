package lab;

public class Movie_Main {
	public static void main(String args[]) {
		Movie m=new Movie();
		m.set_movie_name("IP Man");
		m.set_movie_start("1:00 PM");
		m.set_movie_end("2:45 PM");
		m.set_movie_price(50);
		System.out.println("Movie Name:"+m.get_movie_name());
		System.out.println("Movie Start Time:"+m.get_movie_start());
		System.out.println("Movie End Time:"+m.get_movie_end());
		System.out.println("Ticket Price:"+m.get_movie_price());
	}
}
