package org.study.generics;

public class User implements Comparable<User> {
    public User(int points) {
        this.points = points;
    }

    private String name;
    private int age;
    private final int points;

    @Override
    public String toString() {
        return "Points: " + points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;
    }
}
