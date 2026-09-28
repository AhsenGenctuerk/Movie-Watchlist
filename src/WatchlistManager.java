import java.util.ArrayList;
import java.util.List;

public class WatchlistManager {
    private List<Movie> movies;

    public WatchlistManager() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println(movie.getTitle() + " wurde hinzugefügt.");
    }

    public void removeMovie(String title) {
        boolean removed = movies.removeIf(m -> m.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println(title + " wurde entfernt.");
        } else {
            System.out.println(title + "wurde nicht gefunden.");
        }
    }

    public void markAsWatched(String title) {
        for (Movie m : movies) {
            if (m.getTitle(). equalsIgnoreCase(title)) {
                m.setWatched(true);
                System.out.println(title + " als gesehen markiert.");
                return;
            }
        }
        System.out.println(title + " wurde nicht gefunden.");
    }

    public void printWatchlist() {
        if (movies.isEmpty()) {
            System.out.println("Die Watchlist ist leer.");
            return;
        }
        for (Movie m : movies) {
            String status = m.isWatched() ? "[gesehen]" : "[offen]";
            System.out.println(status + " " + m.getTitle() + " (" + m.getPublicationYear() + ") - " + m.getGenre());
        }
    }

}
