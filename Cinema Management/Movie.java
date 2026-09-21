
public class Movie {

    private String movieName;
    private String movieId;

    public Movie(String movieName, String movieId) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
     public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setHash (){
        BookRegistry.movieDB.put(this.movieName, this.movieId);
    }

}

