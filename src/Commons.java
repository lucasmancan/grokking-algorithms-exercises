public class Commons {
    public static void assertEquals(Object actual, Object expected) {
        if (actual != expected) {
            throw new IllegalArgumentException();
        }
    }
}
