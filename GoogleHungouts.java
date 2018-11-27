package com.company;

public class GoogleHungouts extends GoogleDrive implements Messenger {

    private String avatar;

    public GoogleHungouts(String email) {
        super(email);
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
