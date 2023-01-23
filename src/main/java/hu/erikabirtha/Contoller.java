package hu.erikabirtha;


import org.json.JSONException;
import org.json.JSONObject;

public class Contoller {
    //adatbekérés

    private VehicleRegisterAPI vehicleRegisterAPI;


    public void createNewCar(Car car) {
    //json feltöltés, és ezzel beküld
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("registrationNumber", car.registrationNumber);
            jsonObject.put("make", car.make);
            jsonObject.put("model", car.model);
            jsonObject.put("numberOfSeats", car.numberOfSeats);
            jsonObject.put("vehicleType", car.vehicleType);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        vehicleRegisterAPI.registerVehicle(jsonObject.toString());
    }

    //validate-nem fontos
    //parsejson
    //interactornak küld
    public void registerVehicle(VehicleRegisterAPI vehicleRegisterAPI) {
        this.vehicleRegisterAPI = vehicleRegisterAPI;

    }

}
