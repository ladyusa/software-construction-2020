package lec07io;

import java.io.Serializable;

public class Movie implements Serializable {

    private static final long serialVersionUID = -5038258259234490877L;

    private String name;
    private int length;
    private String category;

    public Movie(String name, int length, String category) {
        this.name = name;
        this.length = length;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int doubleLength() {
        return length * 2;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", category='" + category + '\'' +
                '}';
    }
}
