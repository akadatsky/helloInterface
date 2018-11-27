package com.company;

public class Main {

    public static void main(String[] args) {

        Telegram telegram = new Telegram("+380671234567");
        MyMessenger.test(telegram);

        GoogleDrive googleDrive = new GoogleDrive("asdf@asdf.com");
        MyMessenger.test(googleDrive);

        GoogleHungouts hungouts = new GoogleHungouts("test@asdf.com");
        MyMessenger.test(hungouts);

        // =========================================================


        Database database = new Database();
        AppSettings settings = new AppSettings(database);
        settings.saveConfig();

        AppSettings settings2 = new AppSettings(googleDrive);
        settings2.saveConfig();


    }

}
