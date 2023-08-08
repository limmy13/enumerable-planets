package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury"),
    VENUS("Venus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");

    private final String name;
    private final String displayName;

    Planets(String name) {
        this.name = name;
        this.displayName = name.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }
}
