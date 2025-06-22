package MachineCodingCaseStudies.Parking.Models;

import java.util.List;

public class Slot extends BaseModel{
    private int slotNo;
    private SlotStatus slotState;
    private Floor floor;
    private List<VehicleType> vehicleType;
    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public SlotStatus getSlotState() {
        return slotState;
    }

    public void setSlotState(SlotStatus slotState) {
        this.slotState = slotState;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public List<VehicleType> getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(List<VehicleType> vehicleType) {
        this.vehicleType = vehicleType;
    }

}
