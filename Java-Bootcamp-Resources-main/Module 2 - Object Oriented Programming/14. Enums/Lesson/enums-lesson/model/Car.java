package model;

public class Car {
    private String make;
    private int year;
    public enum TrafficLight {RED, GREEN, YELLOW};

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void drive(TrafficLight trafficLight) {
        if(trafficLight == null) throw new IllegalArgumentException("Traffic Light cannot be null");
        switch (trafficLight) {
            case RED: System.out.println("STOP"); break;
            case GREEN: System.out.println("DRIVE"); break;
            case YELLOW: System.out.println("SLOW DOWN"); break;
        }
    }
}
