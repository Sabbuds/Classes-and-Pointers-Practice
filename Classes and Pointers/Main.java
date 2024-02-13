public class Main {

    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green"); // The "new" keyword means we are running the constructor
        Cookie cookieTwo = new Cookie("blue");

        cookieOne.setColor("yellow");

        System.out.println(cookieOne.getColor()); // Prints color of cookie
        System.out.println(cookieTwo.getColor());
    }

}
