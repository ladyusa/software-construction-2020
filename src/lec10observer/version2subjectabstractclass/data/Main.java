package lec10observer.version2subjectabstractclass.data;

public class Main {

    public static void main(String[] args) {
        Rice rice = new Rice();   // subject
        NewsRoom newsRoom = new NewsRoom(rice);  // observer
        EconStat econStat = new EconStat(rice);  // observer

        rice.setPrice(56);
        System.out.println("--------");
        rice.setPrice(60);
    }
}
