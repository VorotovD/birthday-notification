package io.vorotovd.notification.birthday;

import lombok.AllArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@AllArgsConstructor
public class BirthdaysAnalyzer {

    private final BirthdayProcessor birthdayProcessor;
    private final BirthdaysParser birthdaysParser;

    public static final String RESOURCES = "src/main/resources/";

    public void analyze(final String fileName) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);
        final List<BirthDay> birthDays = birthdaysParser.parseLinesFrom(lines);

        getNextBirthdays(birthDays);
    }

    private void getNextBirthdays(List<BirthDay> birthDays) {
        birthdayProcessor.getNextBirthdaysAtMonth(birthDays).forEach(birthDay -> System.out.println(birthDay.toString()));
    }
}
