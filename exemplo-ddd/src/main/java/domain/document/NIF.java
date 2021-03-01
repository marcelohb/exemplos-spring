package domain.document;

public class NIF {

    private String number;

    public NIF(String number) {
        if (number.length() < 9)
            throw new IllegalArgumentException("Invalid NIF");
        this.number = number;
    }
}
