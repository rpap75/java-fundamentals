package inheritance;

public class MovieReview {
    private String body;
    private String author;
    private int numOfStars;
    private String movie;

    public MovieReview(String text, String author, int numOfStars) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
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


    @Override
    public  String toString() {
        return "some text for body " + body + "By " + author + "star rating is " + numOfStars + movie;
    }

}