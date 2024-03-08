package u8.car;

public class Mercedes extends CarBlueprint implements safetyInterface {

    @Override
    void numberPlate() {
    }
    void numberPlate(String...str) {
    }

    @Override
    public void safetyCheck() {
    }
    void superCalling(){
        super.dualSilencer();
    }
}
