package hu.erikabirtha;

public class UIPresenter implements Display {

    private View view = new View();
    @Override
    public void displayVehicle(String s) {

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
