package quotes;

public class RonSwansonAPI {

    private String author;
    private String quotes;

    public RonSwansonAPI(String quotes) {
        this.author = "Ron Swanson";
        this.quotes = quotes;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuote(String quotes) {
        this.quotes = quotes;
    }
}
