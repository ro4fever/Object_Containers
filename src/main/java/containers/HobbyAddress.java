package containers;

public class HobbyAddress extends Hobby {

    private String address;

    public HobbyAddress(String hobbyName, int inputFrequency, String address) {
        super(hobbyName, inputFrequency);
        this.address = address;
    }
}
