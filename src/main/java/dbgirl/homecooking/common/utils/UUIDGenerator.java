package dbgirl.homecooking.common.utils;

public class UUIDGenerator {
    public static String generate() {
        return java.util.UUID.randomUUID().toString();
    }
}
