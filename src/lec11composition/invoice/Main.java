package lec11composition.invoice;

public class Main {

    public static void main(String[] args) {

        Product coke = new Product("Coke", 15);
        Product icecream = new Product("Ice Cream", 50);
        Product bun = new Product("Bun", 24);
        Product water = new Product("Water", 10);
        Product apple = new Product("Apple", 20);

        Invoice peterInvoice = new Invoice("Peter \nNgam Wong Wan");
        peterInvoice.purchase(coke, 2);
        peterInvoice.purchase(icecream, 1);
        peterInvoice.purchase(bun, 3);

        System.out.println(   peterInvoice.toString()   );

        Invoice katInvoice = new Invoice("Katherine \nBangkhen");
        katInvoice.purchase(bun, 2);
        katInvoice.purchase(icecream, 2);
        katInvoice.purchase(water, 1);
        katInvoice.purchase(apple, 1);

        System.out.println(   katInvoice    );
    }
}
