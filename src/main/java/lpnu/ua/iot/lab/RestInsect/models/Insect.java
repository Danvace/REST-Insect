package lpnu.ua.iot.lab.RestInsect.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Insect {
    public static final String HEADERS = "name, numberOfLegs, hasWings, isDangerous, isSleeping";
    private static long idGenerate = 0;
    private String name;
    private int numberOfLegs;
    private Boolean hasWings = false;
    private Boolean isDangerous = false;
    private Boolean isSleeping = false;

    public static long idCreate() {
        return ++idGenerate;
    }

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return name + ", " + numberOfLegs + ", " + hasWings + ", " + isDangerous + ", " + isSleeping + ", ";
    }

}