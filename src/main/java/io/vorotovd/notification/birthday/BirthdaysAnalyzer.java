package io.vorotovd.notification.birthday;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BirthdaysAnalyzer {
    public static final String RESOURCES = "src/main/resources/";
    public void analyze(final String fileName, final BirthdaysParser birthdaysParser) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);
        final List<BirthDay> birthDays = birthdaysParser.parseLinesFrom(lines);
        final BirthdayProcessor processor = new BirthdayProcessor(birthDays);

        getNextBirthdays(processor);
    }

    public static void getNextBirthdays(BirthdayProcessor processor) {
        processor.getNextBirthdaysAtMonth().forEach(birthDay -> System.out.println(birthDay.toString()));
    }
}
