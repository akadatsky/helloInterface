package com.company;

public class AppSettings {

    public interface Storage {
        void save(String key, String value);
        String load(String key);
    }

    private Storage storage;

    public AppSettings(Storage storage) {
        this.storage = storage;
    }

    public void saveConfig() {
        storage.save("user", "Alex");
        storage.save("email", "asdf@asdf.com");
    }
}
