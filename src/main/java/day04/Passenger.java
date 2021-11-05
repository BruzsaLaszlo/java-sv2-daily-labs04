package day04;

public class Passenger {

    private String name;
    private String tickedId;
    private int packageCount;

    public Passenger(String name, String tickedId, int packageCount) {
        this.name = name;
        this.tickedId = tickedId;
        this.packageCount = packageCount;
    }

    public String getName() {
        return name;
    }

    public String getTickedId() {
        return tickedId;
    }

    public int getPackageCount() {
        return packageCount;
    }
}
