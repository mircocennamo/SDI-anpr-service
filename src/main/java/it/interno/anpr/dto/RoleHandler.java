package it.interno.anpr.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleHandler {

    @Getter
    private static String role;

    public static void setRole(String role) {
        RoleHandler.role = role;
    }
}
