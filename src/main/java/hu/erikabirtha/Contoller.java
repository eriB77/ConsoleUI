package hu.erikabirtha;


import hu.erikabirtha.entity.Vehicle;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Contoller {
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

    public void registerVehicle(VehicleRegisterAPI vehicleRegisterAPI) {
        this.vehicleRegisterAPI = vehicleRegisterAPI;

    }

    public void getVehicleByRegisterNumber(String registrationNumber) {
        //json ob
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("registrationNumber", registrationNumber);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        vehicleRegisterAPI.findByRegistrationNumber(jsonObject.toString());
    }
}
