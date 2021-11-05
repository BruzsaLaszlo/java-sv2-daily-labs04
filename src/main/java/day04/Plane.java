package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int capacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int capacity) {
        this.capacity = capacity;
    }

    public boolean addPassanger(Passenger passenger) {
        if (passengers.size() == capacity)
            return false;
        return passengers.add(passenger);
    }

    public int numberOfPackages() {
        int count = 0;
        for (Passenger p : passengers)
            count += p.getPackageCount();
        return count;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public static void main(String[] args) {

        Plane plane = new Plane(2);
        plane.addPassanger(new Passenger("Pisike", "KHJK-423423", 12));
        plane.addPassanger(new Passenger("Zolika", "KHZY-323423", 12));
        plane.addPassanger(new Passenger("Erzsike", "KHMJ-425523", 12));

        System.out.println(plane.numberOfPackages());

    }

}
