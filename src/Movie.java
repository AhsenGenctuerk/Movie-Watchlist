public class Movie {
    private String title;
    private String reviews; // später datenstruktur ändern zu arraylist oder ähnliches
    private String genre;
    private String regisseur;
    private String author;
    private int publicationYear;
    private String description;
    private boolean watched;
    // Poster

    public Movie(String title) {
        Movie template = MovieData.DATABASE.get(title);
        if (template == null) {
            throw new IllegalArgumentException("Film nicht in Datenbank: " + title);
        }
        this.title = template.title;
        this.genre = template.genre;
        this.regisseur = template.regisseur;
        this.author = template.author;
        this.publicationYear = template.publicationYear;
        this.description = template.description;
        this.reviews = "";
        this.watched = false;
    }

    public Movie(String title, String reviews, String genre, String regisseur, String author, int publicationYear, String description) {
        this.title = title;
        this.reviews = reviews;
        this.genre = genre;
        this.regisseur = regisseur;
        this.author = author;
        this.publicationYear = publicationYear;
        this.description = description;
        this.watched = false;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getReviews() {
        return reviews;
    }
    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRegisseur() {
        return regisseur;
    }
    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isWatched() {
        return watched;
    }
    public void setWatched(boolean watched) {
        this.watched = watched;
    }

}
