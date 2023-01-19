package inheritance;

package businessreviews.businesses;

import businessreviews.reviews.Review;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String priceCategory;
    private float numOfStars;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, String priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.numOfStars = 0;
        reviews = new ArrayList<Review>();
    }

    public void addReview(Review newReview) {
        if (!reviews.contains(newReview)) {
            reviews.add(newReview);

            int sumOfReviewStars = 0;

            for (Review arrayReview : reviews) {
                sumOfReviewStars += arrayReview.stars;
            }

            this.stars = (float) sumOfReviewStars / (float) reviews.size();
        }
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