package it.interno.anpr.enumeration;

public enum WsSecurity {

    CALLBACK_HANDLER("ws-security.callback-handler"),
    SIGNATURE_PROPERTIES("ws-security.signature.properties"),

    SIGNATURE_USERNAME("ws-security.signature.username"),

    VALIDATION_HANDLER("set-jaxb-validation-event-handler");

    private final String key;

    WsSecurity(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
