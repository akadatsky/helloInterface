package com.company;

public class Database implements AppSettings.Storage {

    @Override
    public void save(String key, String value) {
        System.out.println("test save");
    }

    @Override
    public String load(String key) {
        System.out.println("test load");
        return null;
    }

}
