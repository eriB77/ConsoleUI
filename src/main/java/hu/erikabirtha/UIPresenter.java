package hu.erikabirtha;


import org.json.JSONException;
import org.json.JSONObject;

public class UIPresenter implements Display {
    private View view;
    private Car car;
    public UIPresenter(View view1){
        this.view = view1;
    }

    @Override
    public void displayVehicle(String s) {
        //Json parser
        //view meghívása a carral paraméterrel
       Car car = new Car();
        try {
            JSONObject jsonObject = new JSONObject(s);
            car.registrationNumber = jsonObject.getString("registrationNumber");
            car.make = jsonObject.getString("make");
            car.model = jsonObject.getString("model");
            car.numberOfSeats = jsonObject.getInt("numberOfSeats");
            car.vehicleType = jsonObject.getString("vehicleType");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        view.showVehicle(car);
    }

    @Override
    public void displayError(String s) {
        view.showMessage(s);
    }

    @Override
    public void displayOk(String s) {
        view.showMessage(s);
    }
    //parse
    //json- view model - view (system.out.print)nak átadás

}
