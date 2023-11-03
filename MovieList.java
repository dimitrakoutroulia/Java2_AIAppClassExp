import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public String listType; // Τύπος λίστας (public ή private)
    public String creatorID; // ID του δημιουργού της λίστας
    private List<String> movies; // Λίστα των ταινιών

    public MovieList(String listType, String creatorID) {
        this.listType = listType;
        this.creatorID = creatorID;
        this.movies = new ArrayList<>();
    }
    // Προσθήκη ταινίας στη λίστα
    public void addMovie(String movieName) {
        movies.add(movieName);
    }
    // Αφαίρεση ταινίας από τη λίστα
    public void removeMovie(String movieName) {
        movies.remove(movieName);
    }
    // Εμφάνιση των ταινιών στη λίστα
    public void displayMovies() {
        System.out.println("Movies in the list: " + movies);
    }
    // Γεια
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter creator ID: ");
         String creatorID = in.nextLine();

        System.out.println("Enter list type (public or private): ");
        String Listtype = in.nextLine();

        MovieList movieList = new MovieList(Listtype, creatorID);

        while(true) {
            System.out.println("Enter a movie name (or 'exit' to quit, 'remove' to remove a movie)");
            String userInput = in.nextLine();

            if (userInput.equals("exit")) {
                break;
            } else if (userInput.equals("remove")) {
                System.out.println("Enter the movie name you want to remove: ");
                String movieToRemove = in.nextLine();
                movieList.removeMovie(movieToRemove);
                System.out.println(movieToRemove + " removed from the list.");
            } else {
                movieList.addMovie(userInput);
                System.out.println(userInput + " added to the list.");
            }
        }
        movieList.displayMovies();
        in.close();
    } // Τέλος της main 
} // Τέλος της κλάσης MovieList
