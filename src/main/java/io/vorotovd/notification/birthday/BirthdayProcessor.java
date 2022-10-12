package io.vorotovd.notification.birthday;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BirthdayProcessor {
    public List<BirthDay> getNextBirthdaysAtMonth(List<BirthDay> birthDays) {
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
