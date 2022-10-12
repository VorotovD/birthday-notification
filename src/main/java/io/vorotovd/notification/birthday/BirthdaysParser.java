package io.vorotovd.notification.birthday;

import lombok.NonNull;

import java.util.List;
import java.util.stream.Collectors;

public interface BirthdaysParser {
    BirthDay parseFrom(@NonNull String line);
    default List<BirthDay> parseLinesFrom(@NonNull List<String> lines) {
        return lines.stream().map(this::parseFrom).collect(Collectors.toList());
    }
}
