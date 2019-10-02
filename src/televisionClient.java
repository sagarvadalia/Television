public class televisionClient {

    public static void main(String[] args) {
	// write your code here
        Television testTele = new Television();
        System.out.println("default constructor sets the brand to: " + testTele.getBrand());
        System.out.println("default constructor sets the price to: " + testTele.getPrice());
        System.out.println("our default tele is: " + testTele.toString());
        testTele.setPrice(5.0);
        System.out.println("our tv now costs: " + testTele.getPrice());
        testTele.setBrand("Panasonic");
        System.out.println("our tv now has a brand of: " + testTele.getBrand());
        Television testTeleTwo = new Television("Samsung", 20.0);
        System.out.println("overloaded constructor sets the brand to: " + testTele.getBrand());
        System.out.println("overloaded constructor sets the price to: " + testTele.getPrice());
        System.out.println("our overloaded tele is: " + testTele.toString());
        System.out.println("are the teles equal?:" + testTele.equals(testTeleTwo));
        testTeleTwo.setBrand("Panasonic");
        testTeleTwo.setPrice(5.0);
        System.out.println("they should be equal now: " + testTele.equals(testTeleTwo));
        testTeleTwo.setPrice(-5.0);
        System.out.println("range checking. price should be 0: " + testTeleTwo.getPrice());

    }
}
