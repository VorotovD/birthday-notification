package io.vorotovd.notification.birthday;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BirthdayProcessor {
    private final List<BirthDay> birthDays;

    public BirthdayProcessor(List<BirthDay> birthDays) {
        this.birthDays = birthDays;
    }

    public List<BirthDay> getNextBirthdaysAtMonth() {
        List<BirthDay> nextBirthdays = new ArrayList<>();
        LocalDate now = LocalDate.now();
        for (BirthDay birthDay : birthDays) {
            if (birthDay.getBirthDate().getMonth() == now.getMonth() ||
                    birthDay.getBirthDate().getMonth().getValue() == (now.getMonth().getValue() + 1)) {
                nextBirthdays.add(birthDay);
            }
        }
        return nextBirthdays;
    }
}
