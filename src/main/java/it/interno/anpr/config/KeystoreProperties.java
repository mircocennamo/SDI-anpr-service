package it.interno.anpr.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Data
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KeystoreProperties {

    String file;
    String password;
    String type;
    String alias;
}
