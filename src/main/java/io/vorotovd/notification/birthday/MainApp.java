package io.vorotovd.notification.birthday;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        final BirthdaysAnalyzer analyzer = new BirthdaysAnalyzer();
        final BirthdaysParser birthdaysParser = new BirthdayCSVParser();
        analyzer.analyze("birthdays.csv",birthdaysParser);
    }
}
