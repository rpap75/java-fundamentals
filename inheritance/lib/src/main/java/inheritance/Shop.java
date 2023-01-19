package inheritance;

public class Shop {
    private String name;
    private String description;
    private String priceCategory;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, String priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        int sumOfReviewStars = 0;
        // 1. Add it to reviews List
        reviews.add(review);
        // 2. iterate over and get total sum of values
        for (Review arrayReview : reviews) {
            sumOfReviewStars += arrayReview.getNumOfStars();
        }
        // 3. calculate averageNum of stars
        float averagNumOfStars = (sumOfReviewStars / reviews.size());
        // 4. call setNumOfStars with new value
        setNumOfStars(averagNumOfStars);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant " + name + "description is " + description + "price category is " + priceCategory;
    }

}