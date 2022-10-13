package io.vorotovd.notification.birthday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BirhdayParserTest {
    private  final BirthdaysParser parser = new BirthdayCSVParser();

    @Test
    public void parseOneLine() {
        String line = "2012-08-08,Evgeniy";
        BirthDay actual = parser.parseFrom(line);
        BirthDay expected = new BirthDay("Evgeniy", LocalDate.parse("2012-08-08"));
        Assertions.assertEquals(expected.getFullName(), actual.getFullName());
        Assertions.assertEquals(expected.getBirthDate(),actual.getBirthDate());
    }

    @Test
    public void parseList() {
        List<String> expLines = new ArrayList<>();
        String line1 = "2012-08-08,Evgeniy";
        String line2 = "2002-11-23,Sacha";
        String line3 = "2012-11-09,Irina";
        expLines.add(line1);
        expLines.add(line2);
        expLines.add(line3);

        List<BirthDay> actBirthdays = new ArrayList<>();
        actBirthdays.add(new BirthDay("Evgeniy", LocalDate.parse("2012-08-08")));
        actBirthdays.add(new BirthDay("Sacha", LocalDate.parse("2002-11-23")));
        actBirthdays.add(new BirthDay("Irina", LocalDate.parse("2012-11-09")));

        List<BirthDay> expBirthdays = parser.parseLinesFrom(expLines);
        Assertions.assertEquals(expBirthdays,actBirthdays);
    }
}
