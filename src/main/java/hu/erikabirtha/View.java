package hu.erikabirtha;


import java.util.Scanner;

public class View {

    Contoller contoller;
    private final Scanner scanner = new Scanner(System.in);
    public View(Contoller contoller) {
        this.contoller = contoller;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void mainLoop() {
        //adatbekérés
        //validate-nem fontos
        //parsejson
        //interactornak küld

        System.out.println("Choose options!");
        System.out.println("Add new vehicle (A), List of the cars by Registration Number (L)");
        userInputRun();
    }
    public void showVehicle(Car car) {
        System.out.println(car);
        //car property kiírás
        //metódus ami cart vár el és syst outttal kiiírja
    }
    public void userInputRun() {
        boolean consoleIsActive = true;
        while (consoleIsActive) {
            String startQuestion = scanner.next();
            switch (startQuestion) {
                case "A":
                    Car car = new Car();
                    System.out.println("Enter the registration number");
                    String registrationNumber = scanner.next();
                    car.registrationNumber= registrationNumber;

                    System.out.println("Enter the make of Vehicle");
                    String make = scanner.next();
                    car.make = make;

                    System.out.println("Enter the model of the Vehicle");
                    String model = scanner.next();
                    car.model = model;

                    System.out.println("Enter the number of seats");
                    Integer numberOfSeats = scanner.nextInt();
                    car.numberOfSeats = numberOfSeats;

                    System.out.println("Enter the vehicle Type");
                    String vehicleType = scanner.next();
                    car.vehicleType = vehicleType;
                    contoller.createNewCar(car);

                    break;
                case "L":
                    System.out.println("Enter the registration number");
                    String vehicleRegistrationNumber = scanner.next();
                    contoller.getVehicleByRegisterNumber(vehicleRegistrationNumber);

                    break;
                default:
                    System.out.println("Not availabe option!");
                    consoleIsActive = false;
                    break;
            }
        }
    }
}