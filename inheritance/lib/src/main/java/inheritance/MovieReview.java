package inheritance;

package businessreviews.reviews;

public class MovieReview extends Review{

    String movie;

    public MovieReview(String body, String author, int stars, String movie) {
        super(body, author, stars);
        this.movie = movie;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public int getMovie() {
        return movie;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MovieReview{" +
                "movie:'" + movie + '\'' +
                '}';
    }
}