public class AssertionsTest {

    public static void main(String[] args) {

        if (5 == (2 + 3)) {
            System.out.println("assertEquals passed");
        } else {
            System.out.println("assertEquals failed");
        }

        if (5 > 3) {
            System.out.println("assertTrue passed");
        } else {
            System.out.println("assertTrue failed");
        }
        if (!(5 < 3)) {
            System.out.println("assertFalse passed");
        } else {
            System.out.println("assertFalse failed");
        }
        Object obj1 = null;
        if (obj1 == null) {
            System.out.println("assertNull passed");
        } else {
            System.out.println("assertNull failed");
        }
        Object obj2 = new Object();
        if (obj2 != null) {
            System.out.println("assertNotNull passed");
        } else {
            System.out.println("assertNotNull failed");
        }
    }
}
