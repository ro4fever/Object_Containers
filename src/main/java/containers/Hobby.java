package containers;

public class Hobby {

    private String name;
    private int frequency;

    public Hobby (String hobbyName, int inputFrequency) {
        this.name = hobbyName;
        this.frequency = inputFrequency;
    }

    @Override
    public String toString() {
        return "Person's Hobby {" +
                "name = '" + name + '\'' +
                ", frequency = " + frequency +
                '}';
    }


}
