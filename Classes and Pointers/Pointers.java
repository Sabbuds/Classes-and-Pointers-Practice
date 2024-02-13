import java.util.HashMap;

public class Pointers {
    public static void main(String[] args) {
        intExample();
        hashExample();
    }

    public static void intExample() {
        int num1 = 11;
        int num2 = num1; // This does not mean they'll remain equal forever.

        num1 = 22; // When num1's value changes, num2 will not change.

        // This is because we are not using pointers.

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public static void hashExample() {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22); // Notice how both HashMaps change

        // This is because they are both pointing to the same exact place in Memory

        /*
         * We could also make a 3rd hashMap and set map1 equal to it.
         * This will update map1's pointer so that it is now equal to map3
         * However, this will leave map1's original values without a pointer.
         * Java will later clean this up with a process called garbage collection.
         */

        System.out.println(map1);
        System.out.println(map2);
    }
}
