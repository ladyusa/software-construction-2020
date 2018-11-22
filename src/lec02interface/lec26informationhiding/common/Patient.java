package lec02interface.lec26informationhiding.common;

public class Patient {
    private String name;
    private String phone;
    private String address;
    private String id;

    public Patient(String name, String phone, String address, String id) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }
}
