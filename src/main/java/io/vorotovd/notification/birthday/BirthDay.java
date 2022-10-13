package io.vorotovd.notification.birthday;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class BirthDay {
    @NonNull
    private final String fullName;
    @NonNull
    private final LocalDate birthDate;
}
