package util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by vanithakasala on 05/05/2016.
 */
public class DataStorage {

    private static Map<String, String> storage = new ConcurrentHashMap<String, String>();

    public static String EMAIL_KEY = "email";

    public static void add(String key, String value) {
        storage.put(key, value);
    }

    public static String get(String key) {
        return storage.get(key);
    }
}
