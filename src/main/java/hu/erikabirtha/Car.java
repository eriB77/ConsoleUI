package hu.erikabirtha;

public class Car {
    public String registrationNumber;
    public String make;
    public String model;
    public Integer numberOfSeats;
    public String vehicleType;

    @Override
    public String toString() {
        return "Car datas: " +
                "\nregistration number:'" + registrationNumber + '\'' +
                ",\nmake:'" + make + '\'' +
                ",\nmodel:'" + model + '\'' +
                ",\nnumber of seats:" + numberOfSeats +
                ",\nvehicle type:'" + vehicleType + '\'';
    }
}
