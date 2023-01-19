package inheritance;

package businessreviews.reviews;
public class Review {
    private String body;
    private String author;
    private int numOfStars;

    public Review(String text, String author, int numOfStars) {
        this.text = body;
        this.author = author;
        this.numOfStars = numOfStars;
    }

    public String getText() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    @Override
    public  String toString() {
        return "some text for body " + body + "By " + author + "star rating is " + numOfStars;
    }

}