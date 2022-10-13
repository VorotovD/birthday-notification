package io.vorotovd.notification.birthday;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        final BirthdaysParser birthdaysParser = new BirthdayCSVParser();
        final BirthdayProcessor birthdayProcessor = new BirthdayProcessor();
        final BirthdaysAnalyzer analyzer = new BirthdaysAnalyzer(birthdayProcessor, birthdaysParser);

        analyzer.analyze("birthdays.csv");
    }
}
