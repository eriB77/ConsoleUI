package hu.erikabirtha;



public class Contoller {
    //adatbekérés
    //validate-nem fontos
    //parsejson
    //interactornak küld

    private VehicleRegisterAPI vehicleRegisterAPI;

    public void setVehicleRegister(VehicleRegisterAPI vehicleRegisterAPI) {
        this.vehicleRegisterAPI = vehicleRegisterAPI;


    }
    public void mainLoop() {
        //adatbekérés
        //validate-nem fontos
        //parsejson
        //interactornak küld

        vehicleRegisterAPI.registerVehicle("ez még nem a josn, de ez lesz");
    }
}
