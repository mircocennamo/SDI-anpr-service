package it.interno.anpr.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "soap")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnprWsProperties {

    String endpoint;
    @NestedConfigurationProperty
    KeystoreProperties keystore;

}
