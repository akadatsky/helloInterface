package com.company;

public class Telegram implements Messenger {

    private String phone;

    public Telegram(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Telegram{" +
                "phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message from TG: " + message);
    }

}
