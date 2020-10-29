package lec10observer.version1subjectinterface.data;

public class Main {

    public static void main(String[] args) {
        Rice rice = new Rice();   // subject
        NewsRoom newsRoom = new NewsRoom(rice);  // observer
        EconStat econStat = new EconStat(rice);  // observer

        rice.setPrice(30);
        System.out.println("--------");
        rice.setPrice(32);
    }
}
