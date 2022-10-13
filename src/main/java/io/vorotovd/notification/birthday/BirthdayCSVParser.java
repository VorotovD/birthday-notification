package io.vorotovd.notification.birthday;

import lombok.NonNull;

import java.time.LocalDate;

public class BirthdayCSVParser implements BirthdaysParser {

    private static final String DELIM = ",";

    @Override
    public BirthDay parseFrom(@NonNull final String line) {

        try {
            final String[] columns = line.split(DELIM);
            final LocalDate date = LocalDate.parse(columns[0]);
            final String fullName = columns[1];
            return new BirthDay(fullName, date);
        } catch (Exception e) {
            throw new IllegalStateException(String.format("Строка имеет неправильный формат: %s", line));
        }
    }

}
