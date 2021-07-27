package _05_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie Tangled = new Movie("Tangled",5);
		Movie MenInBlackInternational = new Movie("Men In Black", 4); 
		Movie Avengers = new Movie("Avengers", 5);
		Movie AvengersEndgame = new Movie("Endgame", 4);
		Movie WonderWoman1984 = new Movie("Wonder Woman", 1);
		
		Tangled.getTicketPrice();
		MenInBlackInternational.getTicketPrice();
		Avengers.getTicketPrice();
		AvengersEndgame.getTicketPrice();
		WonderWoman1984.getTicketPrice();
		
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(Tangled);
		queue.addMovie(MenInBlackInternational);
		queue.addMovie(Avengers);
		queue.addMovie(AvengersEndgame);
		queue.addMovie(WonderWoman1984);
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is " + queue.movies.get(1));
	}
}
