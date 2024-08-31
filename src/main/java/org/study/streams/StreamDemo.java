package org.study.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show() {
        //////// Filtering with Streams //////////
        List<Movie> movies = List.of(
                new Movie("Hunger Games", 10, Genre.Action),
                new Movie("The Hobbit", 12, Genre.Action),
                new Movie("Equalizer", 16, Genre.Comedy)
        );
        final long likes = movies.stream()
                                 .filter(movie -> movie.getLikes() > 10 && movie.getTitle()
                                                                                .startsWith("T"))
                                 .count();
        System.out.println("Likes count: " + likes);
        final long paginatedMovies = movies.stream()
                                           .skip(2)
                                           .limit(2)
                                           .count();
        System.out.println("Paginated Movies: " + paginatedMovies);
        System.out.println("============ Create Streams =============");
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
              .forEach(System.out::println);

        Stream<Double> stream = Stream.generate(Math::random);
        stream.limit(5)
              .forEach(System.out::println);

        Stream.iterate(1, n -> n + 1)
              .limit(10)
              .forEach(System.out::println);
        // Creating a List of Lists
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Yazer", "Abanoub"),
                Arrays.asList("Anthony", "JDK"),
                Arrays.asList("JVM", "JRE")
        );

        listOfLists.stream()
                   .flatMap(Collection::stream)
                   .forEach(System.out::println);

        System.out.println("============ Compare Streams =============");
        List<Movie> moviesList = List.of(
                new Movie("C", 10, Genre.Action),
                new Movie("B", 20, Genre.Thriller),
                new Movie("A", 16, Genre.Comedy)
        );

        System.out.println("============ Take While =============");
        moviesList.stream()
                  .takeWhile(movie -> movie.getLikes() > 10)
                  .forEach(System.out::println);

        System.out.println("============ Drop While =============");
        moviesList.stream()
                  .dropWhile(movie -> movie.getLikes() > 10)
                  .forEach(System.out::println);

        moviesList.stream()
                  .sorted(Comparator.comparing(Movie::getTitle)
                                    .reversed())
                  .forEach(System.out::println);
        System.out.println("============ Unique Streams =============");

        moviesList.stream()
                  .map(Movie::getLikes)
                  .distinct()
                  .forEach(System.out::println);

        moviesList.stream()
                  .filter(m -> m.getLikes() > 10)
                  .peek(movie -> System.out.println("filtered: " + movie.getTitle()))
                  .map(Movie::getTitle)
                  .peek(t -> System.out.println("mapped: " + t))
                  .forEach(System.out::println);

        System.out.println("============ Reducers & Streams =============");
        System.out.println(moviesList.stream()
                                     .anyMatch(movie -> movie.getLikes() > 10));

        System.out.println(moviesList.stream()
                                     .allMatch(movie -> movie.getLikes() > 10));

        System.out.println(moviesList.stream()
                                     .noneMatch(movie -> movie.getLikes() > 10));

        System.out.println(moviesList.stream()
                                     .findFirst()
                                     .get());
        System.out.println(moviesList.stream()
                                     .max(Comparator.comparing(Movie::getLikes))
                                     .get()
                                     .getTitle());
        Optional<Integer> sum = moviesList.stream()
                                          .map(Movie::getLikes)
                                          .reduce(Integer::sum);
        System.out.println(sum.orElse(0));
        System.out.println(moviesList.stream()
                                     .map(Movie::getLikes)
                                     .reduce(0, Integer::sum));

        List<Movie> list = movies.stream()
                                 .filter(movie -> movie.getLikes() > 10)
                                 .toList();
        System.out.println(list);
        Map<String, Movie> mapList = movies.stream()
                                           .filter(movie -> movie.getLikes() > 10)
                                           .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(mapList);
    }
}