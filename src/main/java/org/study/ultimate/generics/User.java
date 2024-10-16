package org.study.ultimate.generics;

public class User implements Comparable<User> {
    private final int points;
    private String name;
    private int age;
    public User(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Points: " + points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;
    }
}