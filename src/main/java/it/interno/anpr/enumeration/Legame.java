package it.interno.anpr.enumeration;

import lombok.Getter;

@Getter
public enum Legame {

    FAMIGLIA("3","Famiglia"),
    CONVIVENZA("4", "Convivenza"),
   FAMIGLIAAIRE("5","FamigliaAIRE");

    private final String codiceLegame;
    private final String legame;
    Legame(String codiceLegame, String legame) {
        this.codiceLegame = codiceLegame;
        this.legame = legame;
    }

    public static String getLegameByCodice(String codice) {
        for (Legame legame : Legame.values()) {
            if (legame.getCodiceLegame().equals(codice)) {
                return legame.getLegame();
            }
        }
        return null;
    }
}
