package com.company;

public class GoogleDrive implements Messenger, AppSettings.Storage {

    private String email;

    public GoogleDrive(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "GoogleDrive{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message from GoogleDrive: " + message);
    }

    @Override
    public void save(String key, String value) {
        System.out.println("save to GoogleDrive");
    }

    @Override
    public String load(String key) {
        System.out.println("load from GoogleDrive");
        return null;
    }
}
