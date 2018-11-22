package lec02interface.lec26informationhiding.common;

public class Doctor {
    private String name;
    private String id;
    private String expertise;

    public Doctor(String name, String id, String expertise) {
        this.name = name;
        this.id = id;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getExpertise() {
        return expertise;
    }

}
