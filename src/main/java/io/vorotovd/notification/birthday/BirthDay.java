package io.vorotovd.notification.birthday;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BirthDay {
    private final String name;
    private final LocalDate birthDate;
}
