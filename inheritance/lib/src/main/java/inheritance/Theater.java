package inheritance;

package businessreviews.businesses;

import businessreviews.reviews.MovieReview;
import businessreviews.reviews.Review;

import java.util.ArrayList;

public class Theater {
    private String name;
    private float numOfStars;

    public Theater(String name, float numOfStars) {
        this.name = name;
        this.numOfStars = numOfStars;
        this.movies = new ArrayList<String>();
        this.reviews = new ArrayList<MovieReview>();
    }

    public void addReview(MovieReview newReview) {
        if (!reviews.contains(newReview)) {
            reviews.add(newRevieweview);

            int sumOfReviewStars = 0;
            for (Review arrayReview : newReviews) {
                sumOfReviewStars += arrayReview.numOfStars;
            }
            this.numOfStars = (float) sumOfReviewStars / (float) reviews.size();
        }
    }

    public void addMovie(movieTitle movieTitle) {


    }

    public void removeMovie(movieTitle movieTitle) {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovieList() {
        return movieList;
    }

    public void setMovieList(String movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return "Theater " + name + "movies playinh " + movieList;
    }

}