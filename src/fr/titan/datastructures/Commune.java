package fr.titan.datastructures;

import java.util.Objects;

public class Commune {
    private String name;
    private String postalCode;
    private String latitude;
    private String longitude;

    public Commune(String name, String postalCode, String latitude, String longitude) {
        this.name = name;
        this.postalCode = postalCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commune commune = (Commune) o;
        return Objects.equals(name, commune.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
