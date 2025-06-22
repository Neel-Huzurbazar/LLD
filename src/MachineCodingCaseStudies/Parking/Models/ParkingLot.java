package MachineCodingCaseStudies.Parking.Models;

import MachineCodingCaseStudies.Parking.Strategies.PricingStrategy.PricingStrategy;
import MachineCodingCaseStudies.Parking.Strategies.SlotStrategy.SlotStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    List<Floor> floors;
    List<Gate> gates;
    ParkingLotStatus parkingLotStatus;
    PricingStrategy pricingStrategy;
    AllocationStrategy slotStrategy;
    List<Vehicle> allowedVehicles;
    String address;

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public AllocationStrategy getSlotStrategy() {
        return slotStrategy;
    }

    public void setSlotStrategy(AllocationStrategy slotStrategy) {
        this.slotStrategy = slotStrategy;
    }

    public List<Vehicle> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<Vehicle> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
