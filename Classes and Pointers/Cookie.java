public class Cookie {

    // Best practice is to make all class variables PRIVATE

    private String color; // color of cookie

    /**
     * Constructor methods always have the same name as the class
     * In this case the constructor takes an argument, this is not always the case.
     * When a constructor does not take an argument it is a "default" constructor
     * and should therefore print the "default" values (0, null, or anything you set
     * as default)
     */

    public Cookie(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}