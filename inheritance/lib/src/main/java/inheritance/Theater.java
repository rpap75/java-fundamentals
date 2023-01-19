package inheritance;
public class Theater {
    private String name;
    private String movieList;

    public Theater(String name, String movieList) {
        this.name = name;
        this.movieList = movieList;
        ArrayList<String> movieList = new ArrayList<String>();
        movieList.add("Dune");
        movieList.add("Avatar");
        movieList.add("Minions");
    }

    public void addReview(Review review){
        int sumOfReviewStars = 0;
        // 1. Add it to reviews List
        reviews.add(review);
        // 2. iterate over and get total sum of values
        for (Review arrayReview: reviews) {
            sumOfReviewStars += arrayReview.getNumOfStars();
        }
        // 3. calculate averageNum of stars
        float averagNumOfStars = (sumOfReviewStars/reviews.size());
        // 4. call setNumOfStars with new value
        setNumOfStars(averagNumOfStars);
    }

    public void addMovie(movieTitle movieTitle){



    }

    public void removeMovie(movieTitle movieTitle){



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
    public  String toString() {
        return "Theater " + name + "movies playinh " + movieList;
    }

}