public class televisionClient {

    public static void main(String[] args) {

        //test default constructor
        Television testTele = new Television();
        //test accessors for default constructor
        System.out.println("default constructor sets the brand to: " + testTele.getBrand());
        System.out.println("default constructor sets the price to: " + testTele.getPrice());
        //check to string for default constructor
        System.out.println("our default tele is: " + testTele.toString());
        //check mutators for default constructor
        testTele.setPrice(5.0);
        System.out.println("our tv now costs: " + testTele.getPrice());
        testTele.setBrand("Panasonic");
        System.out.println("our tv now has a brand of: " + testTele.getBrand());
        //check overloaded constructor
        Television testTeleTwo = new Television("Samsung", 20.0);
        //accessors for overloaded constructor
        System.out.println("overloaded constructor sets the brand to: " + testTeleTwo.getBrand());
        System.out.println("overloaded constructor sets the price to: " + testTeleTwo.getPrice());
        //check tostring and equals
        System.out.println("our overloaded tele is: " + testTeleTwo.toString());
        System.out.println("are the teles equal?:" + testTele.equals(testTeleTwo));
        //check mutators for overloaded constructor
        testTeleTwo.setBrand("Panasonic");
        testTeleTwo.setPrice(5.0);
        System.out.println("they should be equal now: " + testTele.equals(testTeleTwo));
        testTeleTwo.setPrice(-5.0);
        System.out.println("range checking. price should be 0: " + testTeleTwo.getPrice());

    }
}
