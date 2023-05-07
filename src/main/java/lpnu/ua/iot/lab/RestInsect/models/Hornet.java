package lpnu.ua.iot.lab.RestInsect.models;

import lombok.Getter;

@Getter
public class Hornet extends Insect {

    public static final String HEADERS = "isQueen";

    private final long id;

    private boolean isQueen;

    public Hornet(final String name, final int numberOfLegs, final boolean hasWings, final boolean isDangerous, final boolean isSleeping, final boolean isQueen) {
        this.id = Insect.idCreate();
        this.isQueen = isQueen;
        setNumberOfLegs(numberOfLegs);
        setHasWings(hasWings);
        setIsDangerous(isDangerous);
        setName(name);
        setIsSleeping(isSleeping);
    }

    public Hornet() {
        this.id = Insect.idCreate();
    }


    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        String string = "" + isQueen;
        return super.toCSV() + string;
    }

}

