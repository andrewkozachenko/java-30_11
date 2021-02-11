package com.kozachenko.lesson.lesson14;

import java.util.Objects;

class One implements Comparable<One> {
    private String name;

    public One() {
    }

    public One(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        One one = (One) o;
        return Objects.equals(name, one.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "One{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(One o) {
        if (this.equals(o)) return 0;
        if (this.hashCode() > o.hashCode()) return 1;
        return -1;
    }
}
