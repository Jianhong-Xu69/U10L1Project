public class FrontDoor {
    public static void main(String[] args) {
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55
    }

    public static int sum(int n) {
        // Write a RECURSIVE implementation of this method!
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}
