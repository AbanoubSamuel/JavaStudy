package org.study.ultimate.streams;

public class Movie implements Comparable<Movie> {
    private final String title;
    private final int likes;
    private final Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
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