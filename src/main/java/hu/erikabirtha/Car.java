package hu.erikabirtha;

public class Car {
    public String registrationNumber;
    public String make;
    public String model;
    public Integer numberOfSeats;
    public String vehicleType;

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
