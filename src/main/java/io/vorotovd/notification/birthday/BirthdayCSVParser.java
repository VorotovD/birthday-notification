package io.vorotovd.notification.birthday;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BirthdayCSVParser implements BirthdaysParser {
    @Override
    public BirthDay parseFrom(final String line) {
        final String[] columns = line.split(",");
        final LocalDate date = LocalDate.parse(columns[0]);
        final String name = columns[1];
        return new BirthDay(name, date);
    }

    @Override
    public List<BirthDay> parseLinesFrom(List<String> lines) {
        final List<BirthDay> birthDays = new ArrayList<>();
        for (String line : lines) {
            birthDays.add(parseFrom(line));
        }
        return birthDays;
    }
}
