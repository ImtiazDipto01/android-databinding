package com.example.dipto.databindingpractice.recyclerview;

public class MoviePojo {

    private String moviePoster ;
    private String movieName ;
    private String directorName ;
    private int releaseYear ;

    public MoviePojo(String movieName, String moviePoster, int releaseYear, String directorName){
        this.moviePoster = moviePoster ;
        this.movieName = movieName ;
        this.releaseYear = releaseYear ;
        this.directorName = directorName ;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
