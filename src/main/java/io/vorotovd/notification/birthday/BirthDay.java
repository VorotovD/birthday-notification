package io.vorotovd.notification.birthday;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class BirthDay {
    @NonNull
    private final String name;
    @NonNull
    private final LocalDate birthDate;
}
