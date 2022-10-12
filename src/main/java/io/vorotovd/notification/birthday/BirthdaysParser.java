package io.vorotovd.notification.birthday;

import java.util.List;

public interface BirthdaysParser {
    BirthDay parseFrom(String line);
    List<BirthDay> parseLinesFrom(List<String> lines);
}
