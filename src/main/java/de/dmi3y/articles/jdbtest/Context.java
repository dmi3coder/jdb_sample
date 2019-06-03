package de.dmi3y.articles.jdbtest;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private static Context ourInstance = new Context();
    private Map<String, String> envDataMap;
    private Map<String, String> saveStateMap;

    public static Context getInstance() {
        return ourInstance;
    }

    private Context() {
        envDataMap = new HashMap<>();
        saveStateMap = new HashMap<>();

    }

    public Map<String, String> getEnvDataMap() {
        return envDataMap;
    }

    public Map<String, String> getSaveStateMap() {
        return saveStateMap;
    }
}
