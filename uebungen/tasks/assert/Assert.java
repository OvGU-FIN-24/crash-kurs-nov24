public class Assert {

    // Method to check if two values are equal, with optional message
    public static void assertEquals(Object expected, Object actual) {
        assertEquals(expected, actual, "Assertion failed for assertEquals");
    }
    
    public static void assertEquals(Object expected, Object actual, String message) {
        if (expected == null && actual == null) {
            System.out.println("PASS: " + message + " - Both values are null as expected.");
        } else if (expected != null && expected.equals(actual)) {
            System.out.println("PASS: " + message + " - Expected value (" + expected + ") matches actual value (" + actual + ").");
        } else {
            System.out.println("FAIL: " + message + " - Expected: " + expected + ", but was: " + actual);
        }
    }

    // Method to check if a condition is true, with optional message
    public static void assertTrue(boolean condition) {
        assertTrue(condition, "Assertion failed for assertTrue");
    }

    public static void assertTrue(boolean condition, String message) {
        if (condition) {
            System.out.println("PASS: " + message + " - Condition is true.");
        } else {
            System.out.println("FAIL: " + message + " - Condition is false.");
        }
    }

    // Method to check if a value is null, with optional message
    public static void assertNull(Object obj) {
        assertNull(obj, "Assertion failed for assertNull");
    }

    public static void assertNull(Object obj, String message) {
        if (obj == null) {
            System.out.println("PASS: " + message + " - Value is null as expected.");
        } else {
            System.out.println("FAIL: " + message + " - Expected null, but was: " + obj);
        }
    }

    // Method to check if a value is not null, with optional message
    public static void assertNotNull(Object obj) {
        assertNotNull(obj, "Assertion failed for assertNotNull");
    }

    public static void assertNotNull(Object obj, String message) {
        if (obj != null) {
            System.out.println("PASS: " + message + " - Value is not null as expected.");
        } else {
            System.out.println("FAIL: " + message + " - Expected non-null, but was null.");
        }
    }
}
