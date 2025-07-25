package lld.creational.singleton;

public class SyncDoubleCheck {
    private static volatile SyncDoubleCheck
            instance; // volatile keyword ensures visibility across threads
    private SyncDoubleCheck() {} // Private constructor to prevent instantiation

    public static SyncDoubleCheck getInstance() {
        if (instance == null) { // First check (no synchronization needed here)
            synchronized (
                    SyncDoubleCheck.class) { // Synchronize only when creating the instance
                if (instance == null) { // Second check (inside synchronized block)
                    instance = new SyncDoubleCheck(); // Create the instance if it's still null
                }
            }
        }
        return instance; // Return the single instance
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
