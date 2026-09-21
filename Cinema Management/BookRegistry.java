import java.util.HashMap;

public class BookRegistry {
    public static HashMap <String, String> movieDB = new HashMap<>();

    static{
        movieDB.put("Interseller", "SF103");
        movieDB.put("Lord Of The Rings", "Fa101");
        movieDB.put ("1917", "H762");
    }
    public static synchronized String getMovieId(String movieName) {
        return movieDB.get(movieName);
    }

}
