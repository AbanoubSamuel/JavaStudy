package org.study.streams;

public class Movie implements Comparable<Movie> {
    private final String title;
    private final int likes;

    public Genre getGenre() {
        return genre;
    }

    private final Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public int compareTo(Movie movie) {
        return 0;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                ", genre=" + genre +
                '}';
    }
}